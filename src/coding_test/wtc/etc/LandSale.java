package coding_test.wtc.etc;

public class LandSale {
	
	private static final int LEFT_X = 0;
	private static final int LEFT_Y = 1;
	private static final int RIGHT_X = 2;
	private static final int RIGHT_Y = 3;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static boolean solution(int[][] lands, int[][] wells, int[] point) {
		if (isDuplicated(lands, point)) {
			return false;
		}
		if (!isContained(wells, point)) {
			return false;
		}
		return true;
	}
	
	private static boolean isContained(int[][] wells, int[] point) {
		for (int i = 0; i < wells.length; i++) {
			if (point[LEFT_X] <= wells[i][LEFT_X] && point[RIGHT_X] >= wells[i][RIGHT_X] &&
					point[LEFT_Y] <= wells[i][LEFT_Y] && point[RIGHT_Y] >= wells[i][RIGHT_Y]) {
				return true;
			}
		}
		return false;
	}

	public static boolean isDuplicated(int[][] lands, int[] point) {
		for (int i = 0; i < lands.length; i++) {
			if (lands[i][LEFT_X] < point[RIGHT_X] && lands[i][RIGHT_X] > point[LEFT_X] 
					&& lands[i][RIGHT_Y] > point[LEFT_Y] && lands[i][LEFT_Y] < point[RIGHT_Y]) {
				return true;
			}
		}
		return false;
	}

}
