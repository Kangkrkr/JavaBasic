package _method_;


public class Lotto {

	private static final int VALUE = 45;
	
	private static int count = 0;
	private static int rank[] = new int[5];
	
	public static void main(String[] args) {

		// 로또번호와 사용자 번호를 정렬하고 시작해보면 ?
		// 1 ~ 45 까지 중복되지 않는 숫자 6개 + 보너스번호 ( 보너스번호 역시 중복되면 안됨)
		 int[] lotto = new int[7];
		 makeNonDuplicatedArray(lotto, VALUE);
		 SelectionSort.selectionSort(lotto);
		 printArray(lotto);
		 
		 startLotto(lotto);
		 
		 for(int i=0; i<rank.length; i++){
			 System.out.println((i+1)+" 등 : "+rank[i]);
		 }
	}

	public static void startLotto(int lotto[]) {
		
		for(int i = 0 ; i<10000; i++){
			int man[] = new int[6];
			makeNonDuplicatedArray(man, VALUE);
			SelectionSort.selectionSort(man);
			
			// 비교구문을 수정해야한다. 잘못된 비교구문을 썼기 때문에 rank 집계에 문제가 있었다.
			// 컴퓨터가 뽑은 숫자 : 14 22 28 31 37 44 [보너스 번호는 45 입니다.]
			// 사용자가 뽑은 숫자 : 10 19 22 31 34 40
			// 각 자릿수만 서로 비교했기 때문에 count 는 1밖에 나오지 않았던 것이다.
			for(int row = 0; row<lotto.length-1; row++){
				for(int col = 0; col<man.length; col++){
					if(lotto[row] == man[col]){
						count++;
					}
				}
			}
			
			if(count == 6){
				++rank[0];
			}else if(count == 5){
				
				boolean check = false;
				
				for(int row = 0; row<man.length; row++){
					if(lotto[lotto.length-1] == man[row]){
						check = true;
						break;
					}
				}
				
				if(check){
					++rank[1];
					printArray(man);
				}else{
					++rank[2];
				}
				
			}else if(count == 4){
				++rank[3];
			}else if(count == 3){
				++rank[4];
			}
			
			count = 0;
		}
	}

	public static void makeNonDuplicatedArray(int n[], int to){
		
		// 수정 완료.
		while(!subOperation(n, to)){}
	}
	
	public static boolean subOperation(int n[], int to){
		
		for(int i=0; i<n.length; i++){
			
			n[i] = (int)(Math.random()*to)+1;
			
			for(int j=i-1; j>=0; j--){
				if(n[j] == n[i]){
					return false;
				}
			}
		}
		
		return true;
	}
	
	public static void printArray(int n[]){
		for(int i=0; i<n.length; i++){
			if(i == 6){
				System.out.print("[보너스 번호는 "+n[n.length-1]+" 입니다.]");
				break;
			}
			System.out.print(n[i]+" ");
		}
		System.out.println();
	}
	
	public static void printManArray(int n[]){
		for(int i=0; i<n.length; i++){
			System.out.print(n[i]+" ");
		}
		System.out.println();
	}
}
