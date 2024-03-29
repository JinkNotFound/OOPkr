package Domain;

import java.util.logging.Logger;
import Interface.Operation;

public class CalculatorLogger implements Operation {
    private static final Logger LOGGER = Logger.getLogger(CalculatorLogger.class.getName());

    @Override
    public double execute(double num1, double num2) {
        LOGGER.info("Успешно выполнено");
        return 0;
    }

    @Override
    public String getOperationName() {
        return "Logging";
    }
}
