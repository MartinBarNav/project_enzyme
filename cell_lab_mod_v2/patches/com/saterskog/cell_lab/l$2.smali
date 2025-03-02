.class final Lcom/saterskog/cell_lab/l$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/saterskog/a/b$e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/saterskog/cell_lab/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/saterskog/cell_lab/l;


# direct methods
.method constructor <init>(Lcom/saterskog/cell_lab/l;)V
    .locals 0

    .prologue
    .line 292
    iput-object p1, p0, Lcom/saterskog/cell_lab/l$2;->a:Lcom/saterskog/cell_lab/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/saterskog/a/c;)V
    .locals 2

    .prologue
    .line 294
    invoke-virtual {p1}, Lcom/saterskog/a/c;->a()Z

    move-result v0

    if-nez v0, :cond_0

    .line 296
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Problem setting up In-app Billing: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/saterskog/b/a;->b(Ljava/lang/String;)V

    .line 300
    :goto_0
    return-void

    .line 298
    :cond_0
    iget-object v0, p0, Lcom/saterskog/cell_lab/l$2;->a:Lcom/saterskog/cell_lab/l;

    invoke-virtual {v0}, Lcom/saterskog/cell_lab/l;->a()V

    goto :goto_0
.end method
