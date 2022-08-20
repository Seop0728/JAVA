package Flowcontrol_;

public class LoopArray {
	public static void main(String[] args) {
        /*
        <li>seop</li>
        <li>sehee</li>
        <li>mong</li>
     */

    String[] users = new String[3];
    users[0] = "seop";
    users[1] = "sehee";
    users[2] = "mong";

    //for (int i=0; i<3; i++){
    for (int i=0; i< users.length; i++){
        System.out.println("<li>"+users[i]+"</li>");

    }
		
	}
}
