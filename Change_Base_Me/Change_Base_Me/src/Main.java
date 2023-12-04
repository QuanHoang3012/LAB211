/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author phuongtme
 */
public class Main {
    public static void main(String[] args) {
        Validate validate=new Validate();
        Display display=new Display();
        Convert convert=new Convert();
        while(true){
            //Hiển thị ra menu
            display.menu();
            //lấy Base đầu vào
            int BaseInput=validate.getBase("Enter base input: ", 1, 4, 0);
            //lấy Base đầu ra
            int BaseOutput=validate.getBase("Enter base output: ", 1, 4, BaseInput);
            //nhập số cần chuyển đổi
            String value=validate.getValue("Enter value for convert: ", BaseInput);
            System.out.print("OUTPUT: ");
            //nếu baseIn và baseOut = 10 thì chuyển đổi bình thường
            if(BaseOutput==10){
                System.out.println(convert.OtherToDec(value, BaseInput));
            } else if(BaseInput==10){
                System.out.println(convert.DecToOther(value, BaseOutput));
            } 
            else{
                //nếu là cơ số 2 và 16 thì thực hiện trung gian qua cơ số 10
                String decTmp=convert.OtherToDec(value, BaseInput);
                System.out.println(convert.DecToOther(decTmp, BaseOutput));
            }
        }
    }
}
