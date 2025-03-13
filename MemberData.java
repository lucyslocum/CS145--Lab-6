public class MemberData {
    private String firstName;
    private String lastName;
    private String phoneNum;
    private String email;
    private String address;
    private String memberID;
    private String password;

    public MemberData(String firstName, String lastName, String phoneNum, String email, String address, String memberID, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNum = phoneNum;
        this.email = email;
        this.address = address;
        this.memberID = memberID;
        this.password = password;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setMemberID(String memberID) {
        this.memberID = memberID;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getPhoneNum() {
        return phoneNum;
    }
    public String getEmail() {
        return email;
    }
    public String getAddress() {
        return address;
    }
    public String getMemberID() {
        return memberID;
    }
    public String getPassword() {
        return password;
    }
    public String toString() {
        return "First Name: " + firstName + "\nLast Name: " + lastName + "\nPhone Number: " + phoneNum + "\nEmail: " + email + "\nAddress: " + address + "\nMember ID: " + memberID + "\nPassword: " + password;
    }
}