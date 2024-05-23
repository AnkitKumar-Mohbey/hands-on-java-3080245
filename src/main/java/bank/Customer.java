package bank;

public class Customer {
  private int id;
  private String name;
  private String username;
  private String passward;
  private int accountId;

  // Constructor: Used to initialize object by setting there state
  public Customer(int id, String name, String username, String password, int accountId) {
    setId(id);
    setName(username);
    setUsername(username);
    setPassward(password);
    setAccountId(accountId);
  }

  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getUsername() {
    return this.username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassward() {
    return this.passward;
  }

  public void setPassward(String passward) {
    this.passward = passward;
  }

  public int getAccountId() {
    return this.accountId;
  }

  public void setAccountId(int accountId) {
    this.accountId = accountId;
  }
}
