package phone;

import com.zy.util.SMSUtil;

import java.io.IOException;

public class phone {

    public static void main (String [] args){
        try {
        String p=SMSUtil.postJson("18000318416","66666666-ThankYou-66666666");
            System.out.println(p);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
