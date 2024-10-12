public interface DefaultInterface {
    // default method
    default double p(int a , int z , int e){
        return Math.pow(a , z) * Math.exp(e) / Math.log10(a); // random math eq
    }
}
