public class ArcsinImpl implements ArcsinInterface{

    public ArcsinImpl(){}

    @Override
    public Double arcsin(double x, int n) {
        double result = 0.0;
        for(int i = 1; i <= n; i++){
            result += Math.pow(x, i)*approximateDiff(i)/factorial(i);
        }
        return result;
    }

    private double factorial(int n){
        double f = 1;
        for(int i = 1; i <= n; i++){
            f*=i;
        }
        return f;
    }

    private double approximateDiff(int n){
        switch (n){
            case (1): return 1;
            case (3): return 1;
            case (5): return 9;
            case (7): return 225;
            case (9): return 11025;
            case (11): return 893025;
            case (13): return 108056025;
            default: return 0;
        }
    }
}
