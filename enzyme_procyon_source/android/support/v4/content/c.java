// 
// Decompiled by Procyon v0.5.36
// 

package android.support.v4.content;

public final class c<D>
{
    public int a;
    public a<D> b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    
    public final void a(final a<D> a) {
        if (this.b == null) {
            throw new IllegalStateException("No listener register");
        }
        if (this.b != a) {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
        this.b = null;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder(64);
        android.support.v4.e.c.a(this, sb);
        sb.append(" id=");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }
    
    public interface a<D>
    {
    }
}
