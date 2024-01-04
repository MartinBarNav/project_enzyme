.class final Lcom/saterskog/cell_lab/i$c;
.super Lcom/saterskog/cell_lab/i$e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/saterskog/cell_lab/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "c"
.end annotation


# instance fields
.field a:Landroid/widget/Spinner;

.field b:[Ljava/lang/String;

.field c:Z

.field final synthetic d:Lcom/saterskog/cell_lab/i;


# direct methods
.method public constructor <init>(Lcom/saterskog/cell_lab/i;Ljava/lang/String;Ljava/lang/String;ILcom/saterskog/cell_lab/h;[Ljava/lang/String;IZ)V
    .locals 7

    .prologue
    .line 113
    iput-object p1, p0, Lcom/saterskog/cell_lab/i$c;->d:Lcom/saterskog/cell_lab/i;

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    move-object v5, p5

    move v6, p7

    .line 114
    invoke-direct/range {v0 .. v6}, Lcom/saterskog/cell_lab/i$e;-><init>(Lcom/saterskog/cell_lab/i;Ljava/lang/String;Ljava/lang/String;ILcom/saterskog/cell_lab/h;I)V

    .line 107
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/saterskog/cell_lab/i$c;->a:Landroid/widget/Spinner;

    .line 108
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/saterskog/cell_lab/i$c;->b:[Ljava/lang/String;

    .line 115
    invoke-virtual {p1}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v0

    const v1, 0x7f0e0191

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/saterskog/cell_lab/i$c;->l:Ljava/lang/String;

    .line 116
    iput-object p6, p0, Lcom/saterskog/cell_lab/i$c;->b:[Ljava/lang/String;

    .line 117
    iput-boolean p8, p0, Lcom/saterskog/cell_lab/i$c;->c:Z

    .line 118
    return-void
.end method


# virtual methods
.method final a()Landroid/view/View;
    .locals 6

    .prologue
    const/16 v5, 0xf

    const/4 v4, -0x2

    .line 121
    new-instance v0, Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lcom/saterskog/cell_lab/i$c;->d:Lcom/saterskog/cell_lab/i;

    invoke-virtual {v1}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/saterskog/cell_lab/i$c;->f:Landroid/widget/RelativeLayout;

    .line 122
    iget-object v0, p0, Lcom/saterskog/cell_lab/i$c;->f:Landroid/widget/RelativeLayout;

    new-instance v1, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v2, -0x1

    invoke-direct {v1, v2, v4}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 124
    iget-object v0, p0, Lcom/saterskog/cell_lab/i$c;->f:Landroid/widget/RelativeLayout;

    const/16 v1, 0x10

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setGravity(I)V

    .line 125
    new-instance v0, Landroid/widget/TextView;

    iget-object v1, p0, Lcom/saterskog/cell_lab/i$c;->d:Lcom/saterskog/cell_lab/i;

    invoke-virtual {v1}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/saterskog/cell_lab/i$c;->e:Landroid/widget/TextView;

    .line 126
    iget-object v0, p0, Lcom/saterskog/cell_lab/i$c;->e:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/saterskog/cell_lab/i$c;->i:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ":"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 127
    iget-object v0, p0, Lcom/saterskog/cell_lab/i$c;->e:Landroid/widget/TextView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setClickable(Z)V

    .line 128
    iget-object v0, p0, Lcom/saterskog/cell_lab/i$c;->e:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/saterskog/cell_lab/i$c;->d:Lcom/saterskog/cell_lab/i;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 129
    iget-object v0, p0, Lcom/saterskog/cell_lab/i$c;->e:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/saterskog/cell_lab/i$c;->e:Landroid/widget/TextView;

    invoke-virtual {v1}, Landroid/widget/TextView;->getPaintFlags()I

    move-result v1

    or-int/lit8 v1, v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setPaintFlags(I)V

    .line 130
    iget-object v0, p0, Lcom/saterskog/cell_lab/i$c;->e:Landroid/widget/TextView;

    const v1, 0x7f080041

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setId(I)V

    .line 133
    new-instance v0, Landroid/widget/Spinner;

    iget-object v1, p0, Lcom/saterskog/cell_lab/i$c;->d:Lcom/saterskog/cell_lab/i;

    invoke-virtual {v1}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/widget/Spinner;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/saterskog/cell_lab/i$c;->a:Landroid/widget/Spinner;

    .line 135
    iget-boolean v0, p0, Lcom/saterskog/cell_lab/i$c;->c:Z

    if-eqz v0, :cond_0

    .line 136
    iget-object v0, p0, Lcom/saterskog/cell_lab/i$c;->a:Landroid/widget/Spinner;

    iget-object v1, p0, Lcom/saterskog/cell_lab/i$c;->d:Lcom/saterskog/cell_lab/i;

    iget-object v2, p0, Lcom/saterskog/cell_lab/i$c;->b:[Ljava/lang/String;

    invoke-static {v1, v2}, Lcom/saterskog/cell_lab/i;->a(Lcom/saterskog/cell_lab/i;[Ljava/lang/String;)Landroid/widget/ArrayAdapter;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    .line 143
    :goto_0
    iget-object v0, p0, Lcom/saterskog/cell_lab/i$c;->a:Landroid/widget/Spinner;

    new-instance v1, Lcom/saterskog/cell_lab/i$c$1;

    invoke-direct {v1, p0}, Lcom/saterskog/cell_lab/i$c$1;-><init>(Lcom/saterskog/cell_lab/i$c;)V

    invoke-virtual {v0, v1}, Landroid/widget/Spinner;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    .line 157
    new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-direct {v0, v4, v4}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 158
    const/16 v1, 0x9

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 159
    invoke-virtual {v0, v5}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 160
    iget-object v1, p0, Lcom/saterskog/cell_lab/i$c;->e:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 163
    new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-direct {v0, v4, v4}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 164
    const/16 v1, 0xb

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 165
    invoke-virtual {v0, v5}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 166
    iget-object v1, p0, Lcom/saterskog/cell_lab/i$c;->a:Landroid/widget/Spinner;

    invoke-virtual {v1, v0}, Landroid/widget/Spinner;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 169
    iget-object v0, p0, Lcom/saterskog/cell_lab/i$c;->f:Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lcom/saterskog/cell_lab/i$c;->e:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V

    .line 170
    iget-object v0, p0, Lcom/saterskog/cell_lab/i$c;->f:Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lcom/saterskog/cell_lab/i$c;->a:Landroid/widget/Spinner;

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V

    .line 171
    iget-object v0, p0, Lcom/saterskog/cell_lab/i$c;->f:Landroid/widget/RelativeLayout;

    return-object v0

    .line 140
    :cond_0
    new-instance v0, Landroid/widget/ArrayAdapter;

    iget-object v1, p0, Lcom/saterskog/cell_lab/i$c;->d:Lcom/saterskog/cell_lab/i;

    invoke-virtual {v1}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v1

    const v2, 0x7f0a0028

    iget-object v3, p0, Lcom/saterskog/cell_lab/i$c;->b:[Ljava/lang/String;

    invoke-direct {v0, v1, v2, v3}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;I[Ljava/lang/Object;)V

    .line 141
    iget-object v1, p0, Lcom/saterskog/cell_lab/i$c;->a:Landroid/widget/Spinner;

    invoke-virtual {v1, v0}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    goto :goto_0
.end method

.method public final b()V
    .locals 4

    .prologue
    .line 175
    iget-object v0, p0, Lcom/saterskog/cell_lab/i$c;->f:Landroid/widget/RelativeLayout;

    if-eqz v0, :cond_1

    .line 176
    iget-object v1, p0, Lcom/saterskog/cell_lab/i$c;->f:Landroid/widget/RelativeLayout;

    iget-object v0, p0, Lcom/saterskog/cell_lab/i$c;->g:Lcom/saterskog/cell_lab/h;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/saterskog/cell_lab/i$c;->g:Lcom/saterskog/cell_lab/h;

    iget-object v2, p0, Lcom/saterskog/cell_lab/i$c;->d:Lcom/saterskog/cell_lab/i;

    iget-object v2, v2, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    iget-object v3, p0, Lcom/saterskog/cell_lab/i$c;->d:Lcom/saterskog/cell_lab/i;

    iget v3, v3, Lcom/saterskog/cell_lab/i;->c:I

    aget-object v2, v2, v3

    iget-object v2, v2, Lcom/saterskog/cell_lab/Gene;->s:Lcom/saterskog/cell_lab/h;

    if-ne v0, v2, :cond_2

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v1, v0}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 178
    :cond_1
    iget-object v0, p0, Lcom/saterskog/cell_lab/i$c;->a:Landroid/widget/Spinner;

    iget-object v1, p0, Lcom/saterskog/cell_lab/i$c;->d:Lcom/saterskog/cell_lab/i;

    iget-object v1, v1, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    iget-object v2, p0, Lcom/saterskog/cell_lab/i$c;->d:Lcom/saterskog/cell_lab/i;

    iget v2, v2, Lcom/saterskog/cell_lab/i;->c:I

    aget-object v1, v1, v2

    iget-object v1, v1, Lcom/saterskog/cell_lab/Gene;->u:[I

    iget v2, p0, Lcom/saterskog/cell_lab/i$c;->h:I

    aget v1, v1, v2

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/widget/Spinner;->setSelection(IZ)V

    const-string v4, "Enzyme Debugger"
    const-string v2, "Max Split Dropdown addToView(): Selection set to: "
    invoke-static {v4, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    const-string v4, "Enzyme Debugger"
    invoke-static {v1}, Ljava/lang/String; ->valueOf(I)Ljava/lang/String;
    move-result-object v2
    invoke-static {v4, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 179
    return-void

    .line 176
    :cond_2
    const/16 v0, 0x8

    goto :goto_0
.end method
