package Source;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.ArrayList;


public class Values implements CalcOperationsScaleApps {
    private String[] numbers;
    private static final Logger logger = LoggerFactory.getLogger(Values.class);

    public String doOperation(){
        ArrayList<Double> numberList;
        switch (numbers[OPERATION_INDEX_NUMBER].toLowerCase()){
            case SUM_OPERATION_TAG:
                numberList = this.ToDoubleList(numbers);
                return this.Sum(numberList);
            case MULT_OPERATION_TAG:
                numberList = this.ToDoubleList(numbers);
                return this.Mul(numberList);
            case CUSTOM_OPERATIN_TAG:
                numberList = this.ToDoubleList(numbers);
                return this.myOp(numberList);
        }
        logger.error("There are no operation detected");
        return "There are no operation detected";
    }

    private String Sum(ArrayList<Double> numberList){
        double result = 0;
        for (int i=0; i < numberList.size(); i++){
            result += numberList.get(i);
        }
        return String.valueOf(result);
    }

    private String Mul(ArrayList<Double> numberList){
        double result = 1;
        for (int i=0; i < numberList.size(); i++){
            result *= numberList.get(i);
        }
        return String.valueOf(result);
    }

    private String myOp(ArrayList<Double> numberList){
        try {
            return String.valueOf(numberList.get(0) * numberList.get(1) + numberList.get(2));
        }catch (IndexOutOfBoundsException e){
            logger.error("There are no numbers found");
            return "There are no numbers found";
        }
    }

    private ArrayList<Double> ToDoubleList(String[] inputStr){
        ArrayList<Double> result = new ArrayList<>();
        for (int i = OPERATION_INDEX_NUMBER+1; i < inputStr.length; i++)
            if (inputStr[i].matches("(-|\\+)?[0-9]+(\\.[0-9]+)?"))
                result.add(Double.parseDouble(inputStr[i]));
            else logger.info(inputStr[i] + " - is not a number, program exclude it");
        return result;
    }

    public Values(String[] numbers) {
        this.numbers = numbers;
    }
}
