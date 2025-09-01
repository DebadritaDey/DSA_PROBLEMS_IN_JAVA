class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character> seen = new HashSet<>();

        // 1. Check each row for duplicates
        for (int i = 0; i < 9; i++) {
            seen.clear(); // Reset the set for each new row
            for (int j = 0; j < 9; j++) {
                char current_val = board[i][j];
                if (current_val == '.') {
                    continue; // Skip empty cells
                }
                if (seen.contains(current_val)) {
                    return false; // Found a duplicate in the row
                }
                seen.add(current_val);
            }
        }

        // 2. Check each column for duplicates
        for (int j = 0; j < 9; j++) {
            seen.clear(); // Reset the set for each new column
            for (int i = 0; i < 9; i++) {
                char current_val = board[i][j];
                if (current_val == '.') {
                    continue; // Skip empty cells
                }
                if (seen.contains(current_val)) {
                    return false; // Found a duplicate in the column
                }
                seen.add(current_val);
            }
        }

        // 3. Check each 3x3 sub-box for duplicates
        for (int boxRow = 0; boxRow < 3; boxRow++) {
            for (int boxCol = 0; boxCol < 3; boxCol++) {
                seen.clear(); // Reset the set for each new 3x3 box
                // Iterate within the 3x3 box
                for (int i = boxRow * 3; i < boxRow * 3 + 3; i++) {
                    for (int j = boxCol * 3; j < boxCol * 3 + 3; j++) {
                        char current_val = board[i][j];
                        if (current_val == '.') {
                            continue; // Skip empty cells
                        }
                        if (seen.contains(current_val)) {
                            return false; // Found a duplicate in the 3x3 box
                        }
                        seen.add(current_val);
                    }
                }
            }
        }

        // If we get here, no duplicates were found in any row, column, or box
        return true;
    }
}