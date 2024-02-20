package src.memberOOP;
public class Member {
        private String id;
        private String pw;
        private String name;
        private String personId;
        private String phoneNumber;
        private String address;
        private String job;
        public void setId(String id) {
            this.id = id;
        }
        public void setPw(String pw) {
            this.pw = pw;
        }
        public void setPwAgain(String pwAgain) {
            if (pw.equals(pwAgain)) {
                this.pw = pw;
            } else {
                System.out.println("비밀번호가 일치하지 않습니다.");
            }
        }
        public void setName(String name) {
            this.name = name;
        }
        public void setPersonId(String personId) {
            this.personId = personId;
        }
        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }
        public void setAddress(String address) {
            this.address = address;
        }
        public void setJob(String job) {
            this.job = job;
        }
        public String getId() {
            return id;
        }
        public String getPw() {
            return pw;
        }
        public String getName() {
            return name;
        }
        public String getPersonId() {
            return personId;
        }
        public String getPhoneNumber() {
            return phoneNumber;
        }
        public String getAddress() {
            return address;
        }
        public String getJob() {
            return job;
        }



    }
