.class final Lcom/saterskog/a/b$3$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/saterskog/a/b$3;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/util/List;

.field final synthetic b:Lcom/saterskog/a/b$3;


# direct methods
.method constructor <init>(Lcom/saterskog/a/b$3;Ljava/util/List;)V
    .locals 0

    .prologue
    .line 1088
    iput-object p1, p0, Lcom/saterskog/a/b$3$1;->b:Lcom/saterskog/a/b$3;

    iput-object p2, p0, Lcom/saterskog/a/b$3$1;->a:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 1090
    iget-object v0, p0, Lcom/saterskog/a/b$3$1;->b:Lcom/saterskog/a/b$3;

    iget-object v2, v0, Lcom/saterskog/a/b$3;->b:Lcom/saterskog/a/b$b;

    iget-object v0, p0, Lcom/saterskog/a/b$3$1;->b:Lcom/saterskog/a/b$3;

    iget-object v0, v0, Lcom/saterskog/a/b$3;->a:Ljava/util/List;

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/saterskog/a/e;

    iget-object v1, p0, Lcom/saterskog/a/b$3$1;->a:Ljava/util/List;

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/saterskog/a/c;

    invoke-interface {v2, v0, v1}, Lcom/saterskog/a/b$b;->a(Lcom/saterskog/a/e;Lcom/saterskog/a/c;)V

    .line 1091
    return-void
.end method
