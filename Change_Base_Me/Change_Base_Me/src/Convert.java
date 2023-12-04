
import java.math.BigInteger;

public class Convert {
    //hàm chuyển đổi từ cơ số khác sang cơ số 10
    public String OtherToDec(String other, int base){
        String HEX="0123456789ABCDEF";
        //Sử dụng BigInteger để có thể xử lý các số nguyên cực lớn
        BigInteger baseIn=new BigInteger(Integer.toString(base));
        String result;
        BigInteger value=new BigInteger("0");
        //vòng lặp cho phép duyệt qua các character của dãy
        for(int i=0;i<other.length();i++){
            //other.charAt(i) để chạy qua các character của dãy số
            //HEX.indexOf(...) để chuyển các character sang giá trị ứng với cơ số 10
            String digitHEX=Integer.toString(HEX.indexOf(other.charAt(i)));
            BigInteger coefficient=new BigInteger(digitHEX);
            value=value.add(coefficient.multiply(baseIn.pow(other.length()-i-1)));
        }
        result=value.toString();
        return result;
    }
    public String DecToOther(String dec, int base){
        String HEX="0123456789ABCDEF";
        //BigInteger - xử lý các số nguyên cực lớn
        BigInteger numberIn=new BigInteger(dec);
        StringBuilder result=new StringBuilder();
        BigInteger BaseOut=new BigInteger(Integer.toString(base));
//        if(numberIn.equals(new BigInteger("0"))){
//            return "0";
//        }
        do{
            //lấy số dư remain=numbern%base
            BigInteger remain = numberIn.remainder(BaseOut);
            //chuyển từ giá trị ứng với cơ số 10 sang character
            char c = HEX.charAt(remain.intValue());
            //so sánh với số 0
            //nếu khác thì append chacracter vào đầu chuỗi và number=number/base
            if(!numberIn.equals(new BigInteger("0"))){
                result=result.append(c);
                numberIn=numberIn.divide(BaseOut);
                //nếu bằng 0 thì break vòng
            }else break;
        }while(true);
        //đảo ngược lại chuỗi kết quả
        return result.reverse().toString();
    }
}
