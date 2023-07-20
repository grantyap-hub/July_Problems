import java.util.*;

public class _735_Asteroid_Collision {

    public static int[] asteroidCollision(int[] asteroids){
        Stack<Integer> s = new Stack<Integer>();

        for(int asteroid : asteroids){
            boolean flag = true;
            while(!s.isEmpty() && (s.peek() > 0 && asteroid < 0)){
                if(Math.abs(s.peek()) < Math.abs(asteroid)) {
                    s.pop();
                    continue;
                } else if(Math.abs(s.peek()) == Math.abs(asteroid)){
                    s.pop();
                }
                flag = false;
                break;
            }

            if(flag) {
                s.push(asteroid);
            }
        }

        int[] remaining = new int[s.size()];
        int i = s.size()-1;
        while(!s.isEmpty()){
            remaining[i--] = s.pop();
        }
        return remaining;
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(asteroidCollision((new int[]{5,10,-5}))));

    }
}
