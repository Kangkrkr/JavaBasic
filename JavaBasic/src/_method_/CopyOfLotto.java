package _method_;


public class CopyOfLotto {

	private static final int VALUE = 45;
	
	private static int count = 0;
	private static int rank[] = new int[5];
	
	public static void main(String[] args) {

		/* 로또번호와 사용자 번호를 정렬하고 시작한다.
		   1 ~ 45 까지 중복되지 않는 숫자 6개 + 보너스번호 ( 보너스번호 역시 중복되면 안됨) */
		 int[] lotto = new int[7];
		 
		 makeNonDuplicatedArray(lotto, VALUE);	// 중복되지 않는 7개의 로또 번호를 생성한다.
		 SelectionSort.selectionSort(lotto);	// 로또 번호의 정렬.
		 printArray(lotto);
		 
		 startLotto(lotto);						// 로또 추첨을 시작한다.
		 
		 for(int i=0; i<rank.length; i++){
			 System.out.println((i+1)+" 등 : "+rank[i]);
		 }
	}
	
	
	// 중복되지 않는 수들을 가지는 배열을 만든다. 실제 작업은 subOperation() 메소드에서 한다.
	public static void makeNonDuplicatedArray(int n[], int to){
		
		// 배열 내 모든 수가 중복 되지 않는 수가 될 때까지 재생성.
		while(!subOperation(n, to)){}
	}
	
	
	public static boolean subOperation(int n[], int to){
		
		// 오른쪽에서부터, 왼쪽방향으로의 비교.
		for(int i=0; i<n.length; i++){
			
			n[i] = (int)(Math.random()*to)+1;
			
			// 자기 자신을 제외한, 바로 전 인덱스부터 배열인덱스 0 까지의 탐색.
			for(int j=i-1; j>=0; j--){
				// 자기 자신과 같은 아이템들을 만날경우 false를 반환하며 종료.
				if(n[j] == n[i]){
					return false;
				}
			}
		}
		
		// 모든수가 중복되지 않는다면, true를 반환하며 종료.
		return true;
	}

	
	// 로또 추첨의 시작.
	public static void startLotto(int lotto[]) {
		
		// 추첨은 만번으로 ...
		for(int i = 0 ; i<10000; i++){
			
			// 사람은 적은 숫자가 6개여야 하므로 배열의 크기는 6.
			int man[] = new int[6];
			
			// 마찬가지로, 사람이 적은 수의 배열도 중복되지 않는 수로 생성하고, 정렬한다.
			makeNonDuplicatedArray(man, VALUE);
			SelectionSort.selectionSort(man);
			
			/* 잘못된 비교구문을 썼기 때문에 rank 집계에 문제가 있었다.
			   컴퓨터가 뽑은 숫자 : 14 22 28 31 37 44 [보너스 번호는 45 입니다.]
			   사용자가 뽑은 숫자 : 10 19 22 31 34 40
			   각 자릿수만 서로 비교했기 때문에 count 는 1밖에 나오지 않았던 것이다.]
			   
			   [브루트 포스 기법]을 사용한, 배열내 아이템들을 모두 비교. */
			
			for(int row = 0; row<lotto.length-1; row++){
				for(int col = 0; col<man.length; col++){
					
					// lotto 배열의 한아이템에 대한, man 배열의 모든 순회.
					// 맞는 아이템이 있다면, count 를 1증가.
					if(lotto[row] == man[col]){
						count++;
					}
				}
			}
			
			// 집계 ... 
			if(count == 6){
				++rank[0];
			}else if(count == 5){
				
				// 2등인 경우는 5개의 수와 보너스번호가 맞을 때.
				// 3등인 경우는 5개의 수만 맞을 때.
				boolean check = false;
				
				for(int row = 0; row<man.length; row++){
					
					// 보너스번호에 대한 사용자의 배열 탐색..
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
