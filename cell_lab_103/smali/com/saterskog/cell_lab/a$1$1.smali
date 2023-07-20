.class final Lcom/saterskog/cell_lab/a$1$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/saterskog/cell_lab/a$1;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/saterskog/cell_lab/a$1;


# direct methods
.method constructor <init>(Lcom/saterskog/cell_lab/a$1;)V
    .locals 0

    .prologue
    .line 95
    iput-object p1, p0, Lcom/saterskog/cell_lab/a$1$1;->a:Lcom/saterskog/cell_lab/a$1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 9

    .prologue
    const/4 v5, 0x1

    const/4 v3, 0x0

    const/4 v8, -0x2

    .line 98
    iget-object v0, p0, Lcom/saterskog/cell_lab/a$1$1;->a:Lcom/saterskog/cell_lab/a$1;

    iget-object v0, v0, Lcom/saterskog/cell_lab/a$1;->b:Lcom/saterskog/cell_lab/a;

    invoke-virtual {v0}, Lcom/saterskog/cell_lab/a;->getActivity()Landroid/app/Activity;

    move-result-object v0

    check-cast v0, Lcom/saterskog/cell_lab/l;

    .line 99
    if-eqz v0, :cond_0

    iget-object v1, v0, Lcom/saterskog/cell_lab/l;->k:[Ljava/lang/String;

    if-nez v1, :cond_1

    .line 156
    :cond_0
    :goto_0
    return-void

    .line 100
    :cond_1
    iget-object v1, p0, Lcom/saterskog/cell_lab/a$1$1;->a:Lcom/saterskog/cell_lab/a$1;

    iget-object v1, v1, Lcom/saterskog/cell_lab/a$1;->b:Lcom/saterskog/cell_lab/a;

    invoke-virtual {v1}, Lcom/saterskog/cell_lab/a;->getView()Landroid/view/View;

    move-result-object v1

    .line 101
    if-eqz v1, :cond_0

    .line 102
    iget-object v1, p0, Lcom/saterskog/cell_lab/a$1$1;->a:Lcom/saterskog/cell_lab/a$1;

    iget-object v1, v1, Lcom/saterskog/cell_lab/a$1;->b:Lcom/saterskog/cell_lab/a;

    invoke-virtual {v1}, Lcom/saterskog/cell_lab/a;->getView()Landroid/view/View;

    move-result-object v1

    const v2, 0x7f080053

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/LinearLayout;

    .line 103
    invoke-virtual {v1}, Landroid/widget/LinearLayout;->removeAllViews()V

    move v2, v3

    .line 105
    :goto_1
    iget-object v4, v0, Lcom/saterskog/cell_lab/l;->k:[Ljava/lang/String;

    array-length v4, v4

    if-ge v2, v4, :cond_3

    .line 106
    new-instance v6, Landroid/widget/Button;

    iget-object v4, p0, Lcom/saterskog/cell_lab/a$1$1;->a:Lcom/saterskog/cell_lab/a$1;

    iget-object v4, v4, Lcom/saterskog/cell_lab/a$1;->b:Lcom/saterskog/cell_lab/a;

    invoke-virtual {v4}, Lcom/saterskog/cell_lab/a;->getActivity()Landroid/app/Activity;

    move-result-object v4

    invoke-direct {v6, v4}, Landroid/widget/Button;-><init>(Landroid/content/Context;)V

    .line 108
    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v4, v8, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v6, v4}, Landroid/widget/Button;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 111
    iget-object v4, v0, Lcom/saterskog/cell_lab/l;->k:[Ljava/lang/String;

    aget-object v4, v4, v2

    invoke-virtual {v6, v4}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 112
    iget-object v4, v0, Lcom/saterskog/cell_lab/l;->j:[Z

    aget-boolean v4, v4, v2

    if-nez v4, :cond_2

    move v4, v5

    :goto_2
    invoke-virtual {v6, v4}, Landroid/widget/Button;->setEnabled(Z)V

    .line 114
    new-instance v4, Lcom/saterskog/cell_lab/a$1$1$1;

    invoke-direct {v4, p0, v0, v2}, Lcom/saterskog/cell_lab/a$1$1$1;-><init>(Lcom/saterskog/cell_lab/a$1$1;Lcom/saterskog/cell_lab/l;I)V

    invoke-virtual {v6, v4}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 120
    iget-object v4, p0, Lcom/saterskog/cell_lab/a$1$1;->a:Lcom/saterskog/cell_lab/a$1;

    iget-object v4, v4, Lcom/saterskog/cell_lab/a$1;->b:Lcom/saterskog/cell_lab/a;

    invoke-virtual {v4}, Lcom/saterskog/cell_lab/a;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v4

    iget v4, v4, Landroid/util/DisplayMetrics;->density:F

    .line 121
    const/high16 v7, 0x41000000    # 8.0f

    mul-float/2addr v4, v7

    const/high16 v7, 0x3f000000    # 0.5f

    add-float/2addr v4, v7

    float-to-int v4, v4

    .line 122
    new-instance v7, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v7, v8, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 125
    invoke-virtual {v7, v4, v4, v4, v4}, Landroid/widget/LinearLayout$LayoutParams;->setMargins(IIII)V

    .line 126
    invoke-virtual {v6, v7}, Landroid/widget/Button;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 127
    invoke-virtual {v6, v4, v4, v4, v4}, Landroid/widget/Button;->setPadding(IIII)V

    .line 128
    const/4 v4, 0x2

    const/high16 v7, 0x41600000    # 14.0f

    invoke-virtual {v6, v4, v7}, Landroid/widget/Button;->setTextSize(IF)V

    .line 129
    invoke-virtual {v1, v6}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 105
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_2
    move v4, v3

    .line 112
    goto :goto_2

    .line 131
    :cond_3
    const-string v0, ""

    .line 134
    :try_start_0
    iget-object v1, p0, Lcom/saterskog/cell_lab/a$1$1;->a:Lcom/saterskog/cell_lab/a$1;

    iget-object v1, v1, Lcom/saterskog/cell_lab/a$1;->b:Lcom/saterskog/cell_lab/a;

    invoke-virtual {v1}, Lcom/saterskog/cell_lab/a;->getActivity()Landroid/app/Activity;

    move-result-object v1

    const-string v2, "consumptions"

    invoke-virtual {v1, v2}, Landroid/app/Activity;->openFileInput(Ljava/lang/String;)Ljava/io/FileInputStream;

    move-result-object v1

    .line 135
    new-instance v2, Ljava/io/BufferedReader;

    new-instance v4, Ljava/io/InputStreamReader;

    invoke-direct {v4, v1}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    invoke-direct {v2, v4}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    .line 136
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 138
    :goto_3
    invoke-virtual {v2}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_5

    .line 139
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v6, "\n"

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_3

    .line 148
    :catch_0
    move-exception v1

    .line 149
    :goto_4
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_4

    invoke-virtual {v0, v3, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    const-string v2, "\n"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 150
    invoke-virtual {v0, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    .line 151
    :cond_4
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_6

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "\n"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    .line 152
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v3, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    move-object v1, v0

    .line 154
    :goto_5
    iget-object v0, p0, Lcom/saterskog/cell_lab/a$1$1;->a:Lcom/saterskog/cell_lab/a$1;

    iget-object v0, v0, Lcom/saterskog/cell_lab/a$1;->b:Lcom/saterskog/cell_lab/a;

    invoke-virtual {v0}, Lcom/saterskog/cell_lab/a;->getView()Landroid/view/View;

    move-result-object v0

    const v2, 0x7f0800d0

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 155
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lcom/saterskog/cell_lab/a$1$1;->a:Lcom/saterskog/cell_lab/a$1;

    iget-object v3, v3, Lcom/saterskog/cell_lab/a$1;->b:Lcom/saterskog/cell_lab/a;

    const v4, 0x7f0e0071

    invoke-virtual {v3, v4}, Lcom/saterskog/cell_lab/a;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_0

    .line 141
    :cond_5
    :try_start_1
    invoke-virtual {v2}, Ljava/io/BufferedReader;->close()V

    .line 142
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    :try_end_1
    .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v0

    goto/16 :goto_4

    .line 146
    :catch_1
    move-exception v1

    .line 147
    const-string v2, "updateDonation"

    invoke-static {v2, v1}, Lcom/saterskog/b/a;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto/16 :goto_4

    :cond_6
    move-object v1, v0

    goto :goto_5
.end method
