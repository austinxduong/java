package Arrays;

public class PhoneNumber {
    public static String phoneFormatting(int[] nums) {
        String phoneNumber = "";
        for (int i = 0; i < nums.length; i++) {

            phoneNumber += nums[i];
        }

        String phoneP = phoneNumber.substring(0, 3);
        String phoneE = phoneNumber.substring(6, 10);
        String phoneM = phoneNumber.substring(3, 6);
        return "(" + phoneP + ")" + " " + phoneM + "-" + phoneE;
    }

    public static void main(String[] args) {
        int[] nums = {0, 0, 0, 8, 8, 8, 2, 3, 4, 5, 6, 7};
        System.out.println(phoneFormatting(nums));
    }
    
}
// {0, 0, 0, 8, 8, 8, 2, 3, 4, 5, 6, 7} // (000) 888-2345