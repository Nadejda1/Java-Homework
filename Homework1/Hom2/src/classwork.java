import javax.swing.text.StyledEditorKit.ForegroundAction;


public class classwork {

	public static void main(String[] args) {
		int[] massive1 = {2,5,8,4};
		
		int[] massive2 = new int[5];

	for (int i = 0; i < massive1.length; i++) {
			massive2[i]=massive1[i];
			
			
		}
		for (int i : massive2) {
			System.out.println(i);   
		}
	}
}
