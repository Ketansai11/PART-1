class Bank {
    protected double defaultCharge = 10.0;

    public double getDefaultCharge() {
        return defaultCharge;
    }

    public double calculateTransactionCharge(double amount) {
        return (defaultCharge / 100) * amount;
    }
}

class ICICI extends Bank {
    private double additionalCharge = 2.0;

    @Override
    public double calculateTransactionCharge(double amount) {
        double totalCharge = defaultCharge + additionalCharge;
        return (totalCharge / 100) * amount;
    }

    public double getAdditionalCharge() {
        return additionalCharge;
    }
}

class HDFC extends Bank {
    private double discount = 1.0;

    @Override
    public double calculateTransactionCharge(double amount) {
        double effectiveCharge = defaultCharge - discount;
        return (effectiveCharge / 100) * amount;
    }

    public double getDiscount() {
        return discount;
    }
}
