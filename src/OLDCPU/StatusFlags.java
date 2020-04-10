package OLDCPU;

public class StatusFlags {
    protected boolean Z;
    protected boolean C;
    protected boolean N; // SIGNED
    protected boolean V;

    public boolean Z() {
        return Z;
    }

    public void Z(boolean z) {
        Z = z;
    }

    public boolean C() {
        return C;
    }

    public void C(boolean c) {
        C = c;
    }

    public boolean N() {
        return N;
    }

    public void N(boolean n) {
        N = n;
    }

    public boolean V() {
        return V;
    }

    public void V(boolean v) {
        V = v;
    }
}
