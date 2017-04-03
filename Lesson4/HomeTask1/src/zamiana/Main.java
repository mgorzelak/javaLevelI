package zamiana;

public class Main {

	public static void main(String[] args) {
	String name="Marek";
    char []table1= name.toCharArray();
    table1[0]='J';
    table1[2]='n';
    
    for(int i=0; i<table1.length;i++){
    	System.out.print(table1[i]);
    	
    }
	}

}
