public class JavaPublisher{
	public static void main(String[] args){
		String[] names = new String[]{"Foma Akvinsky", "Alexandr Makedonsky", "Iosif Brodsky"};
		String[] namesbuf=new String[names.length+1];
		for(int i=0;i<names.length;i++){
			namesbuf[i]=names[i];
		}
		namesbuf[names.length]="Marat Latypov";
		names=namesbuf;
		for(int i=0;i<names.length;i++){
			System.out.println(i+")");
			System.out.print(names[i]+", ");
		}
	}
	
}
