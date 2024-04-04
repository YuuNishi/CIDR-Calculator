package org.Calculator;

public class Main {
    public static void main(String[] args) {

    }
    public String getNetworkAddress(Ip ip){


        return "a";
    }
    public String getBroadcast(Ip ip){
        return "a";
    }
    public int[] getMask(Ip ip){
        int bits = 32-ip.getPrefix();
        int cAux= 0;
        int[] mask = {0b11111111, 0b11111111, 0b11111111, 0b11111111};
        if (bits == 0){
            return mask;
        }else{
            for (int i = 3 ; i >= 0; i--){
                for(int j = 8 ; j > 0 ; j-- ){
                    if(bits > 0){
                        mask[i] = mask[i] & (mask[i]- 1);
                        bits --;
                    }else{
                        break;
                    }
                }
            }
        }
        return mask;
    }
    public String range(){
        return "a";
    }
    public int calculateAvailableAddresses(Ip ip){
        int net = 32- ip.getPrefix();
        return (int)Math.pow(2 , net)-2;
    }
}