.class final Lcom/saterskog/cell_lab/p$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/saterskog/cell_lab/p;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/io/File;

.field final synthetic b:Lcom/saterskog/cell_lab/p;


# direct methods
.method constructor <init>(Lcom/saterskog/cell_lab/p;Ljava/io/File;)V
    .locals 0

    .prologue
    .line 160
    iput-object p1, p0, Lcom/saterskog/cell_lab/p$1;->b:Lcom/saterskog/cell_lab/p;

    iput-object p2, p0, Lcom/saterskog/cell_lab/p$1;->a:Ljava/io/File;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .prologue
    .line 164
    iget-object v0, p0, Lcom/saterskog/cell_lab/p$1;->a:Ljava/io/File;

    invoke-static {v0}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v0

    .line 165
    new-instance v1, Landroid/content/Intent;

    const-string v2, "android.intent.action.VIEW"

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 168
    const-string v2, "*/*"

    invoke-virtual {v1, v0, v2}, Landroid/content/Intent;->setDataAndType(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;

    .line 170
    const-string v0, "com.android.chrome"

    invoke-virtual {v1, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 172
    :try_start_0
    iget-object v0, p0, Lcom/saterskog/cell_lab/p$1;->b:Lcom/saterskog/cell_lab/p;

    invoke-virtual {v0, v1}, Lcom/saterskog/cell_lab/p;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 176
    :goto_0
    return-void

    .line 174
    :catch_0
    move-exception v0

    iget-object v0, p0, Lcom/saterskog/cell_lab/p$1;->b:Lcom/saterskog/cell_lab/p;

    invoke-virtual {v0}, Lcom/saterskog/cell_lab/p;->getActivity()Landroid/app/Activity;

    move-result-object v0

    const-string v1, "Please install Chrome."

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    goto :goto_0
.end method
