package classEx;

public class Array {
	int EnrollNumber;
	String Name;
	int Sem;
	int CPI;
		void display() {
			System.out.print("Name"+Name);
			System.out.print("Sem"+Sem);
			System.out.print("CPI"+CPI);
		}
   public static void main(String[] args) {
	   student sc=new student("prafull",2,98);
   }
}
class student extends Array{
		
	student(String Name,int Sem,int CPI){
		this.Name=Name;
		this.Sem=Sem;
		this.CPI=CPI;
	}
}
