.class final Lcom/saterskog/cell_lab/g$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/saterskog/cell_lab/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/widget/EditText;

.field final synthetic b:Landroid/app/Activity;

.field final synthetic c:Ljava/io/File;

.field final synthetic d:Ljava/io/File;

.field final synthetic e:Lcom/saterskog/cell_lab/g;


# direct methods
.method constructor <init>(Lcom/saterskog/cell_lab/g;Landroid/widget/EditText;Landroid/app/Activity;Ljava/io/File;Ljava/io/File;)V
    .locals 0

    .prologue
    .line 246
    iput-object p1, p0, Lcom/saterskog/cell_lab/g$5;->e:Lcom/saterskog/cell_lab/g;

    iput-object p2, p0, Lcom/saterskog/cell_lab/g$5;->a:Landroid/widget/EditText;

    iput-object p3, p0, Lcom/saterskog/cell_lab/g$5;->b:Landroid/app/Activity;

    iput-object p4, p0, Lcom/saterskog/cell_lab/g$5;->c:Ljava/io/File;

    iput-object p5, p0, Lcom/saterskog/cell_lab/g$5;->d:Ljava/io/File;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 8

    .prologue
    const v7, 0x102000b

    const/4 v6, 0x1

    const/high16 v5, -0x10000

    .line 249
    iget-object v0, p0, Lcom/saterskog/cell_lab/g$5;->a:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/saterskog/cell_lab/g;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 250
    iget-object v0, p0, Lcom/saterskog/cell_lab/g$5;->e:Lcom/saterskog/cell_lab/g;

    invoke-virtual {v0}, Lcom/saterskog/cell_lab/g;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->fileList()[Ljava/lang/String;

    move-result-object v2

    .line 251
    array-length v3, v2

    const/4 v0, 0x0

    :goto_0
    if-ge v0, v3, :cond_1

    aget-object v4, v2, v0

    .line 252
    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 253
    iget-object v0, p0, Lcom/saterskog/cell_lab/g$5;->b:Landroid/app/Activity;

    iget-object v1, p0, Lcom/saterskog/cell_lab/g$5;->e:Lcom/saterskog/cell_lab/g;

    const v2, 0x7f0e0197

    invoke-virtual {v1, v2}, Lcom/saterskog/cell_lab/g;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, v6}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v1

    .line 255
    invoke-virtual {v1}, Landroid/widget/Toast;->getView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 256
    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setTextColor(I)V

    .line 257
    invoke-virtual {v1}, Landroid/widget/Toast;->show()V

    .line 270
    :goto_1
    return-void

    .line 251
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 262
    :cond_1
    :try_start_0
    iget-object v0, p0, Lcom/saterskog/cell_lab/g$5;->c:Ljava/io/File;

    new-instance v2, Ljava/io/File;

    iget-object v3, p0, Lcom/saterskog/cell_lab/g$5;->d:Ljava/io/File;

    invoke-direct {v2, v3, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    .line 263
    iget-object v0, p0, Lcom/saterskog/cell_lab/g$5;->e:Lcom/saterskog/cell_lab/g;

    invoke-virtual {v0}, Lcom/saterskog/cell_lab/g;->a()V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    .line 265
    :catch_0
    move-exception v0

    iget-object v0, p0, Lcom/saterskog/cell_lab/g$5;->b:Landroid/app/Activity;

    iget-object v1, p0, Lcom/saterskog/cell_lab/g$5;->e:Lcom/saterskog/cell_lab/g;

    const v2, 0x7f0e0193

    invoke-virtual {v1, v2}, Lcom/saterskog/cell_lab/g;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, v6}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v1

    .line 266
    invoke-virtual {v1}, Landroid/widget/Toast;->getView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 267
    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setTextColor(I)V

    .line 268
    invoke-virtual {v1}, Landroid/widget/Toast;->show()V

    goto :goto_1
.end method
