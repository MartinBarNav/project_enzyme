.class final Lcom/saterskog/cell_lab/PlayActivity$7;
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

.field final synthetic b:Ljava/io/InputStream;

.field final synthetic c:Lcom/saterskog/cell_lab/PlayActivity;


# direct methods
.method constructor <init>(Lcom/saterskog/cell_lab/PlayActivity;Lcom/saterskog/cell_lab/p;Ljava/io/InputStream;)V
    .locals 0

    .prologue
    .line 1151
    iput-object p1, p0, Lcom/saterskog/cell_lab/PlayActivity$7;->c:Lcom/saterskog/cell_lab/PlayActivity;

    iput-object p2, p0, Lcom/saterskog/cell_lab/PlayActivity$7;->a:Lcom/saterskog/cell_lab/p;

    iput-object p3, p0, Lcom/saterskog/cell_lab/PlayActivity$7;->b:Ljava/io/InputStream;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .prologue
    .line 1156
    iget-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity$7;->a:Lcom/saterskog/cell_lab/p;

    iget-object v0, v0, Lcom/saterskog/cell_lab/p;->a:Lcom/saterskog/cell_lab/r;

    iget-object v0, v0, Lcom/saterskog/cell_lab/r;->a:Lcom/saterskog/cell_lab/q;

    iget-object v1, p0, Lcom/saterskog/cell_lab/PlayActivity$7;->b:Ljava/io/InputStream;

    const/4 v2, -0x1

    invoke-virtual {v0, v1, v2}, Lcom/saterskog/cell_lab/q;->a(Ljava/io/InputStream;I)V

    .line 1162
    return-void
.end method
