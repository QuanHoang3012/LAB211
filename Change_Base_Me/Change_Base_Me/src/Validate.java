
import java.util.Scanner;
public class Validate {
    Scanner sc=new Scanner(System.in);
    //hàm lấy cơ số
    public int getBase(String mess,int min, int max, int baseIn){
        int base=0;
        while(true){
            try{
                System.out.print(mess);
                //nhập lựa chọn
                int choice=Integer.parseInt(sc.nextLine());
                //nếu choice ngoài khoảng min max đã cho thì ném ra ngoại lệ
                if(choice>max||choice<min){
                    throw new NumberFormatException();
                }
                switch(choice){
                    //nếu case=1 tương ứng với cơ số 2 - Binary
                    case 1:{
                        base=2;
                        break;
                    }
                    //nếu case=2 tương ứng với cơ số 10 - Decimal
                    case 2:{
                        base=10;
                        break;
                    }
                    //nếu case=3 tương ứng với cơ số 16 - Hexadecimal
                    case 3:{
                        base=16;
                        break;
                    }
                    //case=4 thì thoát chương trình
                    case 4:{
                        System.exit(0);
                    }
                }
                //nếu base output= base input thì thông báo
                if(base==baseIn){
                    System.out.println("Base output could not be same as base input.");
                } else
                    return base;
            }catch(NumberFormatException e){
                System.out.println("Please input positive number between "+min+" - "+max);
            } 
        }
    }
    //hàm lấy giá trị cho cơ số
    public String getValue(String mess, int baseIn){
        String regex="";
        switch(baseIn){
            case 2:{
                //BIN thì gồm các số 0-1
                regex="^[0-1]+$";
                break;
            }
            case 10:{
                //DEC thì gồm các số 0-9
                regex="^[0-9]+$";
                break;
            }
            case 16:{
                //HEX thì gồm các số từ 0-9 chữ cái hoa hoặc thường A-F
                regex="^[0-9A-Fa-f]+$";
                break;
            }
        }
        while(true){
            System.out.print(mess);
            String value=sc.nextLine();
            //nếu giá trị nhập từ bàn phím khớp với giá trị đã cho
            if(value.matches(regex)){
                //return về kiểu in hoa để chuẩn hóa cho kiểu Hex
                //VD: 4d3 -> 4D5
                return value.toUpperCase();
            } else{
                //nếu giá trị không khớp với giá trị đã cho thì thông báo nhập lại
                System.out.println("Invalid number. Please input again.");
            }
        }
    }
}
