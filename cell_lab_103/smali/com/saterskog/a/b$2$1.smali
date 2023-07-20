.class final Lcom/saterskog/a/b$2$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/saterskog/a/b$2;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/saterskog/a/c;

.field final synthetic b:Lcom/saterskog/a/d;

.field final synthetic c:Lcom/saterskog/a/b$2;


# direct methods
.method constructor <init>(Lcom/saterskog/a/b$2;Lcom/saterskog/a/c;Lcom/saterskog/a/d;)V
    .locals 0

    .prologue
    .line 709
    iput-object p1, p0, Lcom/saterskog/a/b$2$1;->c:Lcom/saterskog/a/b$2;

    iput-object p2, p0, Lcom/saterskog/a/b$2$1;->a:Lcom/saterskog/a/c;

    iput-object p3, p0, Lcom/saterskog/a/b$2$1;->b:Lcom/saterskog/a/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .prologue
    .line 711
    iget-object v0, p0, Lcom/saterskog/a/b$2$1;->c:Lcom/saterskog/a/b$2;

    iget-object v0, v0, Lcom/saterskog/a/b$2;->d:Lcom/saterskog/a/b$f;

    iget-object v1, p0, Lcom/saterskog/a/b$2$1;->a:Lcom/saterskog/a/c;

    iget-object v2, p0, Lcom/saterskog/a/b$2$1;->b:Lcom/saterskog/a/d;

    invoke-interface {v0, v1, v2}, Lcom/saterskog/a/b$f;->a(Lcom/saterskog/a/c;Lcom/saterskog/a/d;)V

    .line 712
    return-void
.end method
