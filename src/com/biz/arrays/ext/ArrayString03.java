package com.biz.arrays.ext;

public class ArrayString03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arrG = {
				
				"001:홍길동:90:88:70:60:65",
				"002:이몽룡:91:89:74:61:75",
				"003:성춘향:90:90:78:77:82",
				"004:장보고:71:86:78:60:80",
				"005:임꺽정:90:95:88:74:66",
		};
		
		for(int i = 0; i < arrG.length; i++) {
			String[] arrS = arrG[i].split(":");
			
			System.out.print(arrS[0] + "\t");
			System.out.print(arrS[1] + "\t");
			System.out.print(arrS[2] + "\t");
			System.out.print(arrS[3] + "\t");
			System.out.print(arrS[4] + "\t");
			System.out.print(arrS[5] + "\t");
			System.out.print(arrS[6] + "\t");
			
			int intSum = 0;
			for(int j = 2; j < 6; j++) {
				intSum += Integer.valueOf(arrS[j]);
			}
			System.out.print(intSum+"\t");
			
			float floatAvg = (float)intSum / 4;
			System.out.println(floatAvg);
			
		}

	}

}
