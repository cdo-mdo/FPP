package assignment_2_4;

public class Prog4 {
	public static void main(String[] args) {
		String[] records = Data.records.split(":");
		for (String record: records) {
			String[] columns = record.split(",");
			System.out.println(columns[0]);
		}
	}
}
