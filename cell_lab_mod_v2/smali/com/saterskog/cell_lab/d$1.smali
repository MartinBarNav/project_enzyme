.class final Lcom/saterskog/cell_lab/d$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/saterskog/cell_lab/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/saterskog/cell_lab/d;


# direct methods
.method constructor <init>(Lcom/saterskog/cell_lab/d;)V
    .locals 0

    .prologue
    .line 161
    iput-object p1, p0, Lcom/saterskog/cell_lab/d$1;->a:Lcom/saterskog/cell_lab/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .prologue
    .line 165
    iget-object v0, p0, Lcom/saterskog/cell_lab/d$1;->a:Lcom/saterskog/cell_lab/d;

    iget-object v0, v0, Lcom/saterskog/cell_lab/d;->h:Landroid/content/Context;

    const-string v1, "Not enough graphics memory for selected AA mode"

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    .line 167
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 168
    return-void
.end method
