.class final Lcom/saterskog/cell_lab/PlayActivity$8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/saterskog/cell_lab/PlayActivity;->a(Lcom/saterskog/cell_lab/Environment;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/saterskog/cell_lab/p;

.field final synthetic b:Lcom/saterskog/cell_lab/Environment;

.field final synthetic c:Lcom/saterskog/cell_lab/PlayActivity;


# direct methods
.method constructor <init>(Lcom/saterskog/cell_lab/PlayActivity;Lcom/saterskog/cell_lab/p;Lcom/saterskog/cell_lab/Environment;)V
    .locals 0

    .prologue
    .line 1176
    iput-object p1, p0, Lcom/saterskog/cell_lab/PlayActivity$8;->c:Lcom/saterskog/cell_lab/PlayActivity;

    iput-object p2, p0, Lcom/saterskog/cell_lab/PlayActivity$8;->a:Lcom/saterskog/cell_lab/p;

    iput-object p3, p0, Lcom/saterskog/cell_lab/PlayActivity$8;->b:Lcom/saterskog/cell_lab/Environment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .prologue
    .line 1179
    iget-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity$8;->a:Lcom/saterskog/cell_lab/p;

    iget-object v0, v0, Lcom/saterskog/cell_lab/p;->a:Lcom/saterskog/cell_lab/r;

    iget-object v0, v0, Lcom/saterskog/cell_lab/r;->a:Lcom/saterskog/cell_lab/q;

    iget-object v1, p0, Lcom/saterskog/cell_lab/PlayActivity$8;->b:Lcom/saterskog/cell_lab/Environment;

    .line 2074
    const/4 v2, 0x1

    iput-boolean v2, v0, Lcom/saterskog/cell_lab/q;->t:Z

    .line 2075
    iget-object v0, v0, Lcom/saterskog/cell_lab/q;->s:Lcom/saterskog/cell_lab/Environment;

    invoke-virtual {v0, v1}, Lcom/saterskog/cell_lab/Environment;->a(Lcom/saterskog/cell_lab/Environment;)V

    .line 1180
    return-void
.end method
