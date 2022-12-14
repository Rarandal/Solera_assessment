/*
Base Bugged snippet

public class Problem1 {
    private boolean checkDimensions(CLIQUEUnit other, int e) {
        for (int i = 0; i < e; i++, j += 2) {
            if (dims[i] != other.dims[i]
                    || bounds[j] != other.bounds[j]
                    || bounds[j + 1] != bounds[j + 1]) {
                return false;
            }
        }
        return true;
    }
}
*/

/*
 * Solved Snippet
 * */

public class Problem1 {
    private boolean checkDimensions(CLIQUEUnit one, CLIQUEUnit other, int e) {
        for (int i = 0, j = 0; i < e; i++, j += 2) {
            if (one.dims[i] != other.dims[i]
                    || one.bounds[j] != other.bounds[j]
                    || one.bounds[j + 1] != other.bounds[j + 1]) {
                return false;
            }
        }
        return true;
    }
}