.class final Lcom/saterskog/cell_lab/f$2;
.super Landroid/widget/ArrayAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/saterskog/cell_lab/f;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/widget/ArrayAdapter",
        "<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/saterskog/cell_lab/f;


# direct methods
.method constructor <init>(Lcom/saterskog/cell_lab/f;Landroid/content/Context;Ljava/util/List;)V
    .locals 2

    .prologue
    .line 158
    iput-object p1, p0, Lcom/saterskog/cell_lab/f$2;->a:Lcom/saterskog/cell_lab/f;

    const v0, 0x1090004

    const v1, 0x1020014

    invoke-direct {p0, p2, v0, v1, p3}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;IILjava/util/List;)V

    return-void
.end method


# virtual methods
.method public final getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 9

    .prologue
    .line 161
    invoke-super {p0, p1, p2, p3}, Landroid/widget/ArrayAdapter;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    .line 162
    const v0, 0x1020014

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 163
    const v1, 0x1020015

    invoke-virtual {v3, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    .line 164
    if-nez p1, :cond_0

    .line 166
    iget-object v2, p0, Lcom/saterskog/cell_lab/f$2;->a:Lcom/saterskog/cell_lab/f;

    const v4, 0x7f0e008b

    invoke-virtual {v2, v4}, Lcom/saterskog/cell_lab/f;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 167
    invoke-virtual {v3}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v4, 0x7f050030

    invoke-virtual {v2, v4}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 168
    iget-object v0, p0, Lcom/saterskog/cell_lab/f$2;->a:Lcom/saterskog/cell_lab/f;

    const v2, 0x7f0e008a

    invoke-virtual {v0, v2}, Lcom/saterskog/cell_lab/f;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 205
    :goto_0
    return-object v3

    .line 172
    :cond_0
    const v2, -0xc0c0d

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 173
    iget-object v2, p0, Lcom/saterskog/cell_lab/f$2;->a:Lcom/saterskog/cell_lab/f;

    iget-object v2, v2, Lcom/saterskog/cell_lab/f;->b:Ljava/util/ArrayList;

    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/CharSequence;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 176
    :try_start_0
    new-instance v2, Ljava/io/ObjectInputStream;

    iget-object v0, p0, Lcom/saterskog/cell_lab/f$2;->a:Lcom/saterskog/cell_lab/f;

    invoke-virtual {v0}, Lcom/saterskog/cell_lab/f;->getActivity()Landroid/app/Activity;

    move-result-object v4

    iget-object v0, p0, Lcom/saterskog/cell_lab/f$2;->a:Lcom/saterskog/cell_lab/f;

    iget-object v0, v0, Lcom/saterskog/cell_lab/f;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lcom/saterskog/cell_lab/f;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Landroid/app/Activity;->openFileInput(Ljava/lang/String;)Ljava/io/FileInputStream;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/io/ObjectInputStream;-><init>(Ljava/io/InputStream;)V

    .line 177
    invoke-virtual {v2}, Ljava/io/ObjectInputStream;->readInt()I

    move-result v0

    .line 178
    const/16 v4, 0xbef

    if-gt v0, v4, :cond_1

    .line 179
    invoke-virtual {v2}, Ljava/io/ObjectInputStream;->readDouble()D

    move-result-wide v4

    .line 180
    invoke-virtual {v2}, Ljava/io/ObjectInputStream;->readInt()I

    move-result v0

    .line 182
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v7, p0, Lcom/saterskog/cell_lab/f$2;->a:Lcom/saterskog/cell_lab/f;

    const v8, 0x7f0e0104

    invoke-virtual {v7, v8}, Lcom/saterskog/cell_lab/f;->getString(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v6, ", "

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v6, p0, Lcom/saterskog/cell_lab/f$2;->a:Lcom/saterskog/cell_lab/f;

    const v7, 0x7f0e008d

    invoke-virtual {v6, v7}, Lcom/saterskog/cell_lab/f;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v6, " "

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v6, "%1$,.1f"

    const/4 v7, 0x1

    new-array v7, v7, [Ljava/lang/Object;

    const/4 v8, 0x0

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v4

    aput-object v4, v7, v8

    invoke-static {v6, v7}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v4, " "

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v4, p0, Lcom/saterskog/cell_lab/f$2;->a:Lcom/saterskog/cell_lab/f;

    const v5, 0x7f0e00d1

    invoke-virtual {v4, v5}, Lcom/saterskog/cell_lab/f;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 192
    :goto_1
    invoke-virtual {v2}, Ljava/io/ObjectInputStream;->close()V
    :try_end_0
    .catch Ljava/io/StreamCorruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2

    goto/16 :goto_0

    .line 194
    :catch_0
    move-exception v0

    invoke-static {v0}, Lcom/saterskog/b/a;->a(Ljava/lang/Throwable;)V

    .line 195
    const-string v0, "Error reading substrate"

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_0

    .line 187
    :cond_1
    :try_start_1
    iget-object v0, p0, Lcom/saterskog/cell_lab/f$2;->a:Lcom/saterskog/cell_lab/f;

    const v4, 0x7f0e0196

    invoke-virtual {v0, v4}, Lcom/saterskog/cell_lab/f;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 190
    const/high16 v0, -0x10000

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setTextColor(I)V
    :try_end_1
    .catch Ljava/io/StreamCorruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2

    goto :goto_1

    .line 197
    :catch_1
    move-exception v0

    invoke-static {v0}, Lcom/saterskog/b/a;->a(Ljava/lang/Throwable;)V

    .line 198
    const-string v0, "Error reading substrate"

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_0

    .line 199
    :catch_2
    move-exception v0

    .line 200
    const-string v2, "error io42 but now in ff"

    invoke-static {v2}, Lcom/saterskog/b/a;->a(Ljava/lang/String;)V

    .line 201
    invoke-static {v0}, Lcom/saterskog/b/a;->a(Ljava/lang/Throwable;)V

    .line 202
    const-string v0, "Error reading substrate"

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_0
.end method
