public class BmiService {
    public float calculate(int weight, int height) {
        float bodyMassIndex = weight / ((float) height * (float) height) * 10_000;
        return bodyMassIndex;
    }
}


