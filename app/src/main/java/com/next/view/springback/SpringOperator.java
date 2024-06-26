package com.next.view.springback;

/**
 * ClassName:SpringOperator
 *
 * @author Afton
 * @time 2024/5/21
 * @auditor
 */
public class SpringOperator {

    private final double damping;
    private final double tension;

    public SpringOperator(float f, float f2) {
        double d = (double) f2;
        this.tension = Math.pow(Math.PI * 2 / d, 2.0d);
        this.damping = (((double) f) * Math.PI * 4) / d;
    }

    public double updateVelocity(double d, float f, double d2, double d3) {
        double d4 = (double) f;
        return (d * (1.0d - (this.damping * d4))) + ((double) ((float) (this.tension * (d2 - d3) * d4)));
    }
}