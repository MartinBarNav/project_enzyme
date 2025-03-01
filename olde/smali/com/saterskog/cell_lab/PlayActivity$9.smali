.class final Lcom/saterskog/cell_lab/PlayActivity$9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/saterskog/cell_lab/PlayActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/saterskog/cell_lab/p;

.field final synthetic b:Ljava/io/OutputStream;

.field final synthetic c:Lcom/saterskog/cell_lab/PlayActivity;


# direct methods
.method constructor <init>(Lcom/saterskog/cell_lab/PlayActivity;Lcom/saterskog/cell_lab/p;Ljava/io/OutputStream;)V
    .locals 0

    .prologue
    .line 1279
    iput-object p1, p0, Lcom/saterskog/cell_lab/PlayActivity$9;->c:Lcom/saterskog/cell_lab/PlayActivity;

    iput-object p2, p0, Lcom/saterskog/cell_lab/PlayActivity$9;->a:Lcom/saterskog/cell_lab/p;

    iput-object p3, p0, Lcom/saterskog/cell_lab/PlayActivity$9;->b:Ljava/io/OutputStream;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    .line 1282
    iget-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity$9;->a:Lcom/saterskog/cell_lab/p;

    iget-object v0, v0, Lcom/saterskog/cell_lab/p;->a:Lcom/saterskog/cell_lab/r;

    iget-object v0, v0, Lcom/saterskog/cell_lab/r;->a:Lcom/saterskog/cell_lab/q;

    iget-object v1, p0, Lcom/saterskog/cell_lab/PlayActivity$9;->b:Ljava/io/OutputStream;

    iput-object v1, v0, Lcom/saterskog/cell_lab/q;->N:Ljava/io/OutputStream;

    .line 1283
    return-void
.end method
