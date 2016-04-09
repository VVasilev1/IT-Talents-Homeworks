package zad_2;

public class App {

	
		public static void main(String[] args) {
			GSM htc = new GSM();
			GSM alcatel = new GSM();
			
			alcatel.insertSimCard("088888888");
			htc.insertSimCard("0999999999");
			

			
			alcatel.call(htc, 5);
			
			alcatel.printInfoForLastOutgoingCall();

			htc.printInfoForLastIncomingCall();
			
			System.out.println(alcatel.getSumForCalls());
		}

	}


