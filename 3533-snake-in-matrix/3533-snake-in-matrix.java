class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
int pos = 0;
        for (String command : commands) {
            if (command.equals("LEFT")) {
                pos--;
            } else if (command.equals("RIGHT")) {
                pos++;
            } else if (command.equals("UP")) {
                pos -= n;
            } else {
                pos += n;
            }
                       
        }
        return pos;
    }
}