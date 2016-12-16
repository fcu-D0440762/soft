package oop;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Evaluation evaluation = new Evaluation() ;
		
		Scanner scanner1 = new Scanner(System.in);
		
		while(true){
			
			System.out.println("請輸入課程代碼 :") ;
			int classcourse = scanner1.nextInt() ; // 輸入對應課程的選課代碼
			
			if(classcourse == 1){ //假設有1這個課程代碼 之後希望是從課程清單中比對代碼
				
			System.out.println("顯示課程資訊") ; //這裡是要將所選課程的相關資訊輸出出來 僅帶過
			
			
			System.out.println(" 1. 課程評分 \n 2. 返回 ") ;//應該有多項功能 這裡僅做出評分
			
			Scanner scanner2= new Scanner(System.in);
			int choose1= scanner2.nextInt() ;
			
			switch(choose1){
			
			case 1 :
				while(evaluation.check){
				int s = evaluation.list() ;
				evaluation.select_list(s) ;
				}
				evaluation.check = true ;
				break ;
			
			case 2 :
			    break ;
				
			default :
				System.out.println("無此動作 !") ;
			}
					
			}
		}
	}

}
