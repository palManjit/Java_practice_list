//print factorial of a number n.
class ReccuFact{
	public static int printFact(int n){
		if(n==1 || n==0){
			return 1;
			}
		int fact_num=printFact(n-1);
		int fact_n=n*fact_num;
		return fact_n;
		}
		public static void main(String args[]){
			int n=5;
			int ans=printFact(n);
			System.out.print(ans);
			}
		}
	