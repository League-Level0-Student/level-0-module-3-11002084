
public class DrunkComputer {
	public static void main(String[] args) {
		  for(int i=9999;i>7000;i--){
			  speak(i+ " bottles of beer on the wall," + i + " bottles of beer! Take one down, pass it around," + i + " bottles of beer on the wall!");
			 }
			 for(int e=7000;e>5000;e--){
			  speak(e+ " bOtTLes oF bEEr On tHe wALl," + e + " bOTtlEs OF beER! TaKe oNE DOwn, PAsS iT ARouNd," + e + " boTtLes Of beER oN THe WAll!");
			 }
			 for(int f=5000;f>3000;f--){
			  speak(f+ " b0t7Le5 oF bE3r 0N 7H3 w4L1;" + f + " b0T7tl3s 0f b33Ri 74Ke oN3 D0wN; P45S i7 4R0uND," + f + " b07t1es 0F b3ER On 7he WA11i");
			 }
			 for(int g=3000;g>0;g--){
			  speak("1 4m *hic* A DrUNk b0771e oN 4 *hic* wA11; 4 DruNK B0T713 0n a W4L1i 74k3 *hic* M3 D0Wn; PaS5 m3 4rOuND; I *hic* 4M 4 DruNK BoT7L3 *hic* 0n 4 wA11i *hic*");
			 }
	}

	/* Don’t change this…. */
	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}