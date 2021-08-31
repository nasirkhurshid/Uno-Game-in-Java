/* Copyright August 2021, Nasir Khurshid. All rights reserved. */

import java.util.*;
public class UnoGame {
	public static boolean canPlay(ArrayList<String> hand, String face) {
		if(face.length()!=0 && hand.size()!=0) {
			int faceNum=face.charAt(face.length()-1), handNum;
	        String faceColor="";
	        for(int i=0; i<face.length()-2; i++){
	        	faceColor += face.charAt(i);
	        }
	        for(int j=0; j<hand.size(); j++){
	            String card = hand.get(j);
	            String handColor = "";
	            handNum = card.charAt(card.length()-1);
	            if(handNum == faceNum){
	                return true;
	            }
	            for(int k=0; k<card.length()-2; k++){
	                handColor += card.charAt(k);
	            }
	            if(handColor.equals(faceColor)){
	                return true;
	            }
	        }
		}
		return false;
	}
	public static void main(String[] args) {
		ArrayList<String> hand = new ArrayList<String>();
		hand.add("blue 4"); hand.add("yellow 3"); hand.add("red 1");
		String face1 = "green 3", face2 = "yellow 9", face3 = "red 1", face4 = "orange 9";
		System.out.println("Can play? : " + canPlay(hand, face1));
		System.out.println("Can play? : " + canPlay(hand, face2));
		System.out.println("Can play? : " + canPlay(hand, face3));
		System.out.println("Can play? : " + canPlay(hand, face4));
	}

}
