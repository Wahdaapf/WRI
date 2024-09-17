class CustomerAccount implements BankAccount {
    private double balance;
    private String accountHolder;
  // ^ kira2 ini apa? dan kenapa? 

    public CustomerAccount(String accountHolder) {
        this.accountHolder = accountHolder;
        this.balance = 0.0;
    }

    @Override
    public void deposit(double amount) throws InvalidDataException {
         // Jika jumlah yang mau ditambah itu negatif, angkat InvalidDataException
         if (amount <= 0) {
            throw new InvalidDataException();
        }
        // Kalau valid, tambahkan ke balance
        this.balance += amount;
    }

    @Override
    public void withdraw(double amount) throws InvalidDataException, InsufficientBalanceException {
        // Jika jumlah yang mau diambil itu negatif, angkat InvalidDataException
        if (amount <= 0) {
            throw new InvalidDataException();
        }
        // Kalau jumlah yang diambil lebih besar dari saldo, angkat InsufficientBalanceException
        if (amount > balance) {
            throw new InsufficientBalanceException();
        }
        // Kalau valid, kurangi saldo
        this.balance -= amount;
    }
}