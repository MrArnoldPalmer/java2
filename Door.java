public class Door {
    private String inscription;
    private boolean closed;
    private boolean locked;

    public Door(String i) {
        this.inscription = i;
        this.closed = true;
        this.locked = true;
    }

    public String getInscription() {
        return this.inscription;
    }

    private void setClosed(boolean value) {
        this.closed = value;
    }

    public boolean isClosed() {
        return this.closed;
    }

    private void setLocked(boolean value) {
        this.locked = value;
    }

    public boolean isLocked() {
        return this.locked;
    }

    public void open() {
        if(this.closed == true && this.locked == false) {
            this.setClosed(false);
        }
        else if(this.closed == false){
            System.err.println("This door is already open");
        }
        else if(this.locked == true) {
            System.err.println("This door is locked");
        }
    }

    public void close() {
        if(this.closed == false) {
            this.setClosed(true);
        }
        else {
            System.err.println("This door is already closed");
        }
    }

    public void lock() {
        if(this.locked == false) {
            this.setLocked(true);   
        }
        else {
            System.out.println("This door is already locked");
        }
    }

    public void unlock() {
        if(this.locked == true) {
            this.setLocked(false);
        }
        else {
            System.out.println("This door is already unlocked");
        }
    }

    public void printString() {
        String i;
        String l;
        String c;

        if(this.getInscription() == null || this.getInscription() == "")
            i = "This door has no inscription\n";
        else
            i = "This door is labeled " + this.getInscription() + "\n";

        if(this.isLocked())
            l = "This door is locked\n";
        else
            l = "This door is unlocked\n";

        if(this.isClosed())
            c = "This door is closed\n";
        else
            c= "This door is open\n";

        System.out.println(i + l + c);
    }
}