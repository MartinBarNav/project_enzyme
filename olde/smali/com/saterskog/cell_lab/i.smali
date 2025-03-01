.class public final Lcom/saterskog/cell_lab/i;
.super Landroid/app/Fragment;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Landroid/widget/AdapterView$OnItemSelectedListener;
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;
.implements Landroid/widget/SeekBar$OnSeekBarChangeListener;
.implements Lcom/saterskog/cell_lab/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/saterskog/cell_lab/i$d;,
        Lcom/saterskog/cell_lab/i$f;,
        Lcom/saterskog/cell_lab/i$a;,
        Lcom/saterskog/cell_lab/i$c;,
        Lcom/saterskog/cell_lab/i$e;,
        Lcom/saterskog/cell_lab/i$b;
    }
.end annotation


# instance fields
.field a:[Lcom/saterskog/cell_lab/Gene;

.field b:Landroid/widget/Button;

.field c:I

.field protected d:Ljava/lang/String;

.field e:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/saterskog/cell_lab/h;",
            ">;"
        }
    .end annotation
.end field

.field public f:Lcom/saterskog/cell_lab/i$b;

.field private g:Z

.field private h:Z

.field private i:Z

.field private j:Z

.field private k:Z

.field private l:I

.field private m:Lcom/saterskog/cell_lab/GenomePreviewView;

.field private n:D

.field private o:Landroid/view/View;

.field private p:Lcom/saterskog/cell_lab/i$a;

.field private q:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/saterskog/cell_lab/i$e;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 5

    .prologue
    const/4 v0, 0x0

    .line 872
    invoke-direct {p0}, Landroid/app/Fragment;-><init>()V

    .line 71
    iput v0, p0, Lcom/saterskog/cell_lab/i;->c:I

    .line 873
    const/4 v1, 0x0

    iput-object v1, p0, Lcom/saterskog/cell_lab/i;->e:Ljava/util/ArrayList;

    .line 874
    iput-boolean v0, p0, Lcom/saterskog/cell_lab/i;->i:Z

    .line 875
    iput-boolean v0, p0, Lcom/saterskog/cell_lab/i;->j:Z

    .line 876
    iput-boolean v0, p0, Lcom/saterskog/cell_lab/i;->g:Z

    .line 877
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lcom/saterskog/cell_lab/i;->e:Ljava/util/ArrayList;

    .line 878
    sget-object v1, Lcom/saterskog/cell_lab/h;->B:[Lcom/saterskog/cell_lab/h;

    array-length v2, v1

    :goto_0
    if-ge v0, v2, :cond_0

    aget-object v3, v1, v0

    .line 879
    iget-object v4, p0, Lcom/saterskog/cell_lab/i;->e:Ljava/util/ArrayList;

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 878
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 881
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/saterskog/cell_lab/i;->q:Ljava/util/ArrayList;

    .line 883
    return-void
.end method

.method private static a(FFF)F
    .locals 4

    .prologue
    const/high16 v3, 0x41c00000    # 24.0f

    .line 1922
    sub-float v0, p2, p1

    sub-float v1, p0, p1

    mul-float/2addr v1, v3

    sub-float v2, p2, p1

    div-float/2addr v1, v2

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    int-to-float v1, v1

    mul-float/2addr v0, v1

    div-float/2addr v0, v3

    add-float/2addr v0, p1

    return v0
.end method

.method static synthetic a(Lcom/saterskog/cell_lab/i;)I
    .locals 1

    .prologue
    .line 56
    iget v0, p0, Lcom/saterskog/cell_lab/i;->l:I

    return v0
.end method

.method static synthetic a(Lcom/saterskog/cell_lab/i;[Ljava/lang/String;)Landroid/widget/ArrayAdapter;
    .locals 1

    .prologue
    .line 56
    const/4 v0, 0x0

    invoke-direct {p0, v0, p1}, Lcom/saterskog/cell_lab/i;->a(Z[Ljava/lang/String;)Landroid/widget/ArrayAdapter;

    move-result-object v0

    return-object v0
.end method

.method private a(Z[Ljava/lang/String;)Landroid/widget/ArrayAdapter;
    .locals 2

    .prologue
    .line 1000
    new-instance v0, Lcom/saterskog/cell_lab/i$2;

    invoke-virtual {p0}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v1

    invoke-direct {v0, p0, v1, p2, p1}, Lcom/saterskog/cell_lab/i$2;-><init>(Lcom/saterskog/cell_lab/i;Landroid/content/Context;[Ljava/lang/String;Z)V

    return-object v0
.end method

.method private a(ID)V
    .locals 4

    .prologue
    .line 1633
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/SeekBar;

    .line 1634
    if-eqz v0, :cond_0

    .line 1636
    iget-boolean v1, p0, Lcom/saterskog/cell_lab/i;->h:Z

    if-eqz v1, :cond_1

    const v1, 0x7f0800b0

    if-eq p1, v1, :cond_1

    .line 1637
    const/16 v1, 0x18

    .line 1640
    :goto_0
    int-to-double v2, v1

    mul-double/2addr v2, p2

    double-to-float v1, v2

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setProgress(I)V

    .line 1642
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v0

    const v1, 0x7f0800e8

    invoke-virtual {v0, v1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 1643
    if-eqz v0, :cond_0

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1645
    :cond_0
    return-void

    .line 1639
    :cond_1
    const/16 v1, 0x4b0

    goto :goto_0
.end method

.method private a(II)V
    .locals 2

    .prologue
    .line 1647
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Spinner;

    .line 1648
    if-eqz v0, :cond_0

    .line 1649
    const/4 v1, 0x1

    invoke-virtual {v0, p2, v1}, Landroid/widget/Spinner;->setSelection(IZ)V

    .line 1650
    :cond_0
    return-void
.end method

.method private a(Landroid/view/View;I)V
    .locals 1

    .prologue
    .line 1403
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Spinner;

    invoke-virtual {v0, p0}, Landroid/widget/Spinner;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    .line 1404
    return-void
.end method

.method static synthetic a(Lcom/saterskog/cell_lab/i;I)V
    .locals 0

    .prologue
    .line 56
    invoke-direct {p0, p1}, Lcom/saterskog/cell_lab/i;->c(I)V

    return-void
.end method

.method static synthetic a(Lcom/saterskog/cell_lab/i;Ljava/lang/String;)V
    .locals 5

    .prologue
    const/4 v0, 0x0

    const/4 v4, 0x1

    .line 9121
    :try_start_0
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, p1, v2}, Landroid/app/Activity;->openFileOutput(Ljava/lang/String;I)Ljava/io/FileOutputStream;

    move-result-object v1

    .line 9122
    new-instance v2, Ljava/io/ObjectOutputStream;

    new-instance v3, Ljava/io/BufferedOutputStream;

    invoke-direct {v3, v1}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V

    invoke-direct {v2, v3}, Ljava/io/ObjectOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 9123
    const/16 v1, 0xbef

    invoke-virtual {v2, v1}, Ljava/io/ObjectOutputStream;->writeInt(I)V

    .line 9124
    :goto_0
    const/16 v1, 0x50

    if-ge v0, v1, :cond_0

    .line 9125
    iget-object v1, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    aget-object v1, v1, v0

    invoke-virtual {v1, v2}, Lcom/saterskog/cell_lab/Gene;->a(Ljava/io/ObjectOutputStream;)V

    .line 9124
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 9126
    :cond_0
    invoke-virtual {v2}, Ljava/io/ObjectOutputStream;->close()V

    .line 9127
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {p0}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v1

    const v2, 0x7f0e019d

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 9128
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v0

    check-cast v0, Lcom/saterskog/cell_lab/PlayActivity;

    const/4 v1, 0x7

    invoke-virtual {v0, v1}, Lcom/saterskog/cell_lab/PlayActivity;->a(S)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    .line 9138
    :goto_1
    return-void

    .line 9130
    :catch_0
    move-exception v0

    invoke-virtual {p0}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {p0}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v1

    const v2, 0x7f0e0193

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v1

    .line 9131
    invoke-virtual {v1}, Landroid/widget/Toast;->getView()Landroid/view/View;

    move-result-object v0

    const v2, 0x102000b

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 9132
    const/high16 v2, -0x10000

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 9133
    invoke-virtual {v1}, Landroid/widget/Toast;->show()V

    .line 9134
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v0

    check-cast v0, Lcom/saterskog/cell_lab/PlayActivity;

    invoke-virtual {v0, v4}, Lcom/saterskog/cell_lab/PlayActivity;->a(S)V

    goto :goto_1

    .line 9137
    :catch_1
    move-exception v0

    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_1
.end method

.method private a(Ljava/lang/String;Ljava/lang/CharSequence;)V
    .locals 4

    .prologue
    .line 2050
    new-instance v1, Landroid/app/AlertDialog$Builder;

    invoke-virtual {p0}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-direct {v1, v0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 2052
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v0

    .line 2053
    const v2, 0x7f0a0025

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v2

    .line 2054
    const v0, 0x7f0800e9

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2055
    const v0, 0x7f0800d5

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {v0, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2061
    invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    .line 2064
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v0

    const v2, 0x7f0e005d

    invoke-virtual {v0, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    new-instance v2, Lcom/saterskog/cell_lab/i$6;

    invoke-direct {v2, p0}, Lcom/saterskog/cell_lab/i$6;-><init>(Lcom/saterskog/cell_lab/i;)V

    invoke-virtual {v1, v0, v2}, Landroid/app/AlertDialog$Builder;->setNeutralButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 2074
    invoke-virtual {v1}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    .line 2075
    return-void
.end method

.method private static a(DD)Z
    .locals 2

    .prologue
    .line 1884
    cmpl-double v0, p0, p2

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method static synthetic b(Lcom/saterskog/cell_lab/i;)Ljava/util/ArrayList;
    .locals 1

    .prologue
    .line 56
    iget-object v0, p0, Lcom/saterskog/cell_lab/i;->e:Ljava/util/ArrayList;

    return-object v0
.end method

.method private b()V
    .locals 7

    .prologue
    const/4 v6, 0x2

    const v5, 0x3f666666    # 0.9f

    const/4 v4, 0x1

    const v3, 0x3dcccccd    # 0.1f

    const/4 v0, 0x0

    .line 980
    move v1, v0

    :goto_0
    const/16 v2, 0x50

    if-ge v1, v2, :cond_0

    .line 981
    invoke-direct {p0, v1}, Lcom/saterskog/cell_lab/i;->c(I)V

    .line 980
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 983
    :cond_0
    iget-object v1, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    const/4 v2, 0x4

    aget-object v1, v1, v2

    iget-object v1, v1, Lcom/saterskog/cell_lab/Gene;->a:[F

    aput v3, v1, v0

    .line 984
    iget-object v1, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    const/4 v2, 0x4

    aget-object v1, v1, v2

    iget-object v1, v1, Lcom/saterskog/cell_lab/Gene;->a:[F

    aput v5, v1, v4

    .line 985
    iget-object v1, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    const/4 v2, 0x5

    aget-object v1, v1, v2

    iget-object v1, v1, Lcom/saterskog/cell_lab/Gene;->a:[F

    aput v3, v1, v0

    .line 986
    iget-object v1, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    const/4 v2, 0x6

    aget-object v1, v1, v2

    iget-object v1, v1, Lcom/saterskog/cell_lab/Gene;->a:[F

    const/high16 v2, 0x3f000000    # 0.5f

    aput v2, v1, v0

    .line 987
    sget-object v1, Lcom/saterskog/b/d;->a:Lcom/saterskog/b/d;

    .line 5017
    invoke-virtual {v1, v4}, Lcom/saterskog/b/d;->nextInt(I)I

    move-result v1

    .line 987
    if-nez v1, :cond_1

    .line 988
    iget-object v1, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    aget-object v1, v1, v4

    iget-object v1, v1, Lcom/saterskog/cell_lab/Gene;->a:[F

    aput v3, v1, v0

    .line 989
    iget-object v1, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    aget-object v1, v1, v6

    iget-object v1, v1, Lcom/saterskog/cell_lab/Gene;->a:[F

    aput v5, v1, v0

    .line 995
    :goto_1
    const/16 v1, 0x50

    if-ge v0, v1, :cond_2

    invoke-direct {p0, v0}, Lcom/saterskog/cell_lab/i;->d(I)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 992
    :cond_1
    iget-object v1, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    aget-object v1, v1, v4

    iget-object v1, v1, Lcom/saterskog/cell_lab/Gene;->a:[F

    aput v5, v1, v0

    .line 993
    iget-object v1, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    aget-object v1, v1, v6

    iget-object v1, v1, Lcom/saterskog/cell_lab/Gene;->a:[F

    aput v3, v1, v0

    goto :goto_1

    .line 996
    :cond_2
    return-void
.end method

.method private b(IZ)V
    .locals 1

    .prologue
    .line 1652
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    .line 1653
    if-eqz v0, :cond_0

    .line 1654
    invoke-virtual {v0, p2}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 1655
    :cond_0
    return-void
.end method

.method private b(Landroid/view/View;I)V
    .locals 1

    .prologue
    .line 1406
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1407
    return-void
.end method

.method private c()V
    .locals 4

    .prologue
    const/4 v3, 0x1

    .line 1836
    iget-boolean v0, p0, Lcom/saterskog/cell_lab/i;->h:Z

    if-eqz v0, :cond_1

    const/16 v0, 0x18

    :goto_0
    iput v0, p0, Lcom/saterskog/cell_lab/i;->l:I

    .line 1837
    iput-boolean v3, p0, Lcom/saterskog/cell_lab/i;->i:Z

    .line 1838
    iget v1, p0, Lcom/saterskog/cell_lab/i;->l:I

    .line 6845
    iget-boolean v2, p0, Lcom/saterskog/cell_lab/i;->i:Z

    .line 6846
    iput-boolean v3, p0, Lcom/saterskog/cell_lab/i;->i:Z

    .line 6847
    iget-object v0, p0, Lcom/saterskog/cell_lab/i;->o:Landroid/view/View;

    const v3, 0x7f0800ac

    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/SeekBar;

    invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setMax(I)V

    .line 6848
    iget-object v0, p0, Lcom/saterskog/cell_lab/i;->o:Landroid/view/View;

    const v3, 0x7f08009e

    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/SeekBar;

    invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setMax(I)V

    .line 6849
    iget-object v0, p0, Lcom/saterskog/cell_lab/i;->o:Landroid/view/View;

    const v3, 0x7f0800a0

    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/SeekBar;

    invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setMax(I)V

    .line 6850
    iget-object v0, p0, Lcom/saterskog/cell_lab/i;->o:Landroid/view/View;

    const v3, 0x7f0800aa

    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/SeekBar;

    invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setMax(I)V

    .line 6851
    iget-object v0, p0, Lcom/saterskog/cell_lab/i;->o:Landroid/view/View;

    const v3, 0x7f0800a2

    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/SeekBar;

    invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setMax(I)V

    .line 6852
    iget-object v0, p0, Lcom/saterskog/cell_lab/i;->o:Landroid/view/View;

    const v3, 0x7f08009c

    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/SeekBar;

    invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setMax(I)V

    .line 6853
    iget-object v0, p0, Lcom/saterskog/cell_lab/i;->o:Landroid/view/View;

    const v3, 0x7f0800ae

    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/SeekBar;

    invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setMax(I)V

    .line 6854
    iget-object v0, p0, Lcom/saterskog/cell_lab/i;->o:Landroid/view/View;

    const v3, 0x7f0800a4

    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/SeekBar;

    invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setMax(I)V

    .line 6855
    iget-object v0, p0, Lcom/saterskog/cell_lab/i;->o:Landroid/view/View;

    const v3, 0x7f0800a7

    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/SeekBar;

    invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setMax(I)V

    .line 6856
    iget-object v0, p0, Lcom/saterskog/cell_lab/i;->o:Landroid/view/View;

    const v3, 0x7f0800a9

    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/SeekBar;

    invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setMax(I)V

    .line 6857
    iput-boolean v2, p0, Lcom/saterskog/cell_lab/i;->i:Z

    .line 1839
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/saterskog/cell_lab/i;->i:Z

    .line 1840
    iget-boolean v0, p0, Lcom/saterskog/cell_lab/i;->h:Z

    if-eqz v0, :cond_0

    .line 1841
    iget v0, p0, Lcom/saterskog/cell_lab/i;->c:I

    invoke-direct {p0, v0}, Lcom/saterskog/cell_lab/i;->d(I)V

    .line 1843
    :cond_0
    return-void

    .line 1836
    :cond_1
    const/16 v0, 0x4b0

    goto/16 :goto_0
.end method

.method private c(I)V
    .locals 9

    .prologue
    const/high16 v8, 0x3f800000    # 1.0f

    const/4 v7, 0x2

    const/4 v6, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 932
    iget-object v0, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    new-instance v3, Lcom/saterskog/cell_lab/Gene;

    invoke-direct {v3}, Lcom/saterskog/cell_lab/Gene;-><init>()V

    aput-object v3, v0, p1

    .line 933
    iget-object v0, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    aget-object v0, v0, p1

    const v3, 0x3e810624    # 0.25199997f

    iput v3, v0, Lcom/saterskog/cell_lab/Gene;->b:F

    .line 934
    iget-object v0, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    aget-object v0, v0, p1

    iget-object v0, v0, Lcom/saterskog/cell_lab/Gene;->a:[F

    sget-object v3, Lcom/saterskog/b/d;->a:Lcom/saterskog/b/d;

    .line 3008
    invoke-virtual {v3}, Lcom/saterskog/b/d;->nextDouble()D

    move-result-wide v4

    .line 934
    double-to-float v3, v4

    aput v3, v0, v2

    .line 935
    iget-object v0, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    aget-object v0, v0, p1

    iget-object v0, v0, Lcom/saterskog/cell_lab/Gene;->a:[F

    sget-object v3, Lcom/saterskog/b/d;->a:Lcom/saterskog/b/d;

    .line 4008
    invoke-virtual {v3}, Lcom/saterskog/b/d;->nextDouble()D

    move-result-wide v4

    .line 935
    double-to-float v3, v4

    aput v3, v0, v1

    .line 936
    iget-object v0, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    aget-object v0, v0, p1

    iget-object v0, v0, Lcom/saterskog/cell_lab/Gene;->a:[F

    sget-object v3, Lcom/saterskog/b/d;->a:Lcom/saterskog/b/d;

    .line 5008
    invoke-virtual {v3}, Lcom/saterskog/b/d;->nextDouble()D

    move-result-wide v4

    .line 936
    double-to-float v3, v4

    aput v3, v0, v7

    .line 937
    iget-object v0, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    aget-object v0, v0, p1

    iget-object v0, v0, Lcom/saterskog/cell_lab/Gene;->a:[F

    aget v0, v0, v2

    iget-object v3, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    aget-object v3, v3, p1

    iget-object v3, v3, Lcom/saterskog/cell_lab/Gene;->a:[F

    aget v3, v3, v2

    mul-float/2addr v0, v3

    iget-object v3, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    aget-object v3, v3, p1

    iget-object v3, v3, Lcom/saterskog/cell_lab/Gene;->a:[F

    aget v3, v3, v1

    iget-object v4, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    aget-object v4, v4, p1

    iget-object v4, v4, Lcom/saterskog/cell_lab/Gene;->a:[F

    aget v4, v4, v1

    mul-float/2addr v3, v4

    add-float/2addr v0, v3

    iget-object v3, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    aget-object v3, v3, p1

    iget-object v3, v3, Lcom/saterskog/cell_lab/Gene;->a:[F

    aget v3, v3, v7

    iget-object v4, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    aget-object v4, v4, p1

    iget-object v4, v4, Lcom/saterskog/cell_lab/Gene;->a:[F

    aget v4, v4, v7

    mul-float/2addr v3, v4

    add-float/2addr v0, v3

    .line 939
    float-to-double v4, v0

    invoke-static {v4, v5}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v4

    double-to-float v0, v4

    .line 940
    iget-object v3, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    aget-object v3, v3, p1

    iget-object v3, v3, Lcom/saterskog/cell_lab/Gene;->a:[F

    aget v4, v3, v2

    div-float/2addr v4, v0

    aput v4, v3, v2

    .line 941
    iget-object v3, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    aget-object v3, v3, p1

    iget-object v3, v3, Lcom/saterskog/cell_lab/Gene;->a:[F

    aget v4, v3, v1

    div-float/2addr v4, v0

    aput v4, v3, v1

    .line 942
    iget-object v3, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    aget-object v3, v3, p1

    iget-object v3, v3, Lcom/saterskog/cell_lab/Gene;->a:[F

    aget v4, v3, v7

    div-float v0, v4, v0

    aput v0, v3, v7

    .line 943
    iget-object v0, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    aget-object v0, v0, p1

    iput v6, v0, Lcom/saterskog/cell_lab/Gene;->d:F

    .line 944
    iget-object v0, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    aget-object v0, v0, p1

    const/high16 v3, 0x3f000000    # 0.5f

    iput v3, v0, Lcom/saterskog/cell_lab/Gene;->c:F

    .line 945
    iget-object v0, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    aget-object v0, v0, p1

    iput v6, v0, Lcom/saterskog/cell_lab/Gene;->e:F

    .line 946
    iget-object v0, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    aget-object v0, v0, p1

    iput v6, v0, Lcom/saterskog/cell_lab/Gene;->f:F

    .line 947
    iget-object v0, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    aget-object v0, v0, p1

    iput v8, v0, Lcom/saterskog/cell_lab/Gene;->g:F

    .line 948
    iget-object v0, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    aget-object v3, v0, p1

    iget-object v0, p0, Lcom/saterskog/cell_lab/i;->e:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/saterskog/cell_lab/h;

    iput-object v0, v3, Lcom/saterskog/cell_lab/Gene;->s:Lcom/saterskog/cell_lab/h;

    .line 949
    iget-object v0, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    aget-object v0, v0, p1

    iput p1, v0, Lcom/saterskog/cell_lab/Gene;->i:I

    .line 950
    iget-object v0, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    aget-object v0, v0, p1

    iput p1, v0, Lcom/saterskog/cell_lab/Gene;->j:I

    .line 951
    iget-object v0, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    aget-object v0, v0, p1

    iput-boolean v2, v0, Lcom/saterskog/cell_lab/Gene;->l:Z

    .line 952
    iget-object v0, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    aget-object v0, v0, p1

    iput-boolean v1, v0, Lcom/saterskog/cell_lab/Gene;->m:Z

    .line 953
    iget-object v0, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    aget-object v0, v0, p1

    iput-boolean v1, v0, Lcom/saterskog/cell_lab/Gene;->n:Z

    .line 955
    iget-object v0, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    aget-object v0, v0, p1

    iput-boolean v1, v0, Lcom/saterskog/cell_lab/Gene;->o:Z

    .line 959
    iget-object v0, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    aget-object v3, v0, p1

    if-nez p1, :cond_0

    move v0, v1

    :goto_0
    iput-boolean v0, v3, Lcom/saterskog/cell_lab/Gene;->p:Z

    move v0, v2

    .line 961
    :goto_1
    const/16 v3, 0xb

    if-ge v0, v3, :cond_1

    .line 962
    iget-object v3, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    aget-object v3, v3, p1

    iget-object v3, v3, Lcom/saterskog/cell_lab/Gene;->t:[Lcom/saterskog/cell_lab/Gene$a;

    aget-object v3, v3, v0

    iput-short v2, v3, Lcom/saterskog/cell_lab/Gene$a;->e:S

    .line 963
    iget-object v3, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    aget-object v3, v3, p1

    iget-object v3, v3, Lcom/saterskog/cell_lab/Gene;->t:[Lcom/saterskog/cell_lab/Gene$a;

    aget-object v3, v3, v0

    iput-short v2, v3, Lcom/saterskog/cell_lab/Gene$a;->d:S

    .line 964
    iget-object v3, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    aget-object v3, v3, p1

    iget-object v3, v3, Lcom/saterskog/cell_lab/Gene;->t:[Lcom/saterskog/cell_lab/Gene$a;

    aget-object v3, v3, v0

    iput v6, v3, Lcom/saterskog/cell_lab/Gene$a;->a:F

    .line 965
    iget-object v3, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    aget-object v3, v3, p1

    iget-object v3, v3, Lcom/saterskog/cell_lab/Gene;->t:[Lcom/saterskog/cell_lab/Gene$a;

    aget-object v3, v3, v0

    iput v6, v3, Lcom/saterskog/cell_lab/Gene$a;->b:F

    .line 966
    iget-object v3, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    aget-object v3, v3, p1

    iget-object v3, v3, Lcom/saterskog/cell_lab/Gene;->t:[Lcom/saterskog/cell_lab/Gene$a;

    aget-object v3, v3, v0

    iput v6, v3, Lcom/saterskog/cell_lab/Gene$a;->c:F

    .line 961
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_0
    move v0, v2

    .line 959
    goto :goto_0

    .line 968
    :cond_1
    iget-object v0, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    aget-object v0, v0, p1

    iget-object v0, v0, Lcom/saterskog/cell_lab/Gene;->t:[Lcom/saterskog/cell_lab/Gene$a;

    aget-object v0, v0, v2

    const v3, -0x41b33334    # -0.19999999f

    const/high16 v4, -0x40800000    # -1.0f

    invoke-static {v3, v4, v8}, Lcom/saterskog/cell_lab/i;->a(FFF)F

    move-result v3

    iput v3, v0, Lcom/saterskog/cell_lab/Gene$a;->b:F

    move v0, v2

    .line 969
    :goto_2
    const/16 v3, 0xb

    if-ge v0, v3, :cond_2

    .line 970
    iget-object v3, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    aget-object v3, v3, p1

    iget-object v3, v3, Lcom/saterskog/cell_lab/Gene;->u:[I

    aput v2, v3, v0

    .line 969
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    .line 972
    :cond_2
    iget-object v0, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    aget-object v0, v0, p1

    iget-object v0, v0, Lcom/saterskog/cell_lab/Gene;->u:[I

    aput p1, v0, v2

    .line 973
    iget-object v0, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    aget-object v0, v0, p1

    iget-object v0, v0, Lcom/saterskog/cell_lab/Gene;->u:[I

    aput p1, v0, v1

    .line 975
    iget-object v0, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    aget-object v0, v0, p1

    iget-object v0, v0, Lcom/saterskog/cell_lab/Gene;->v:[F

    const/4 v1, 0x6

    aput v8, v0, v1

    .line 976
    iget-object v0, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    aget-object v0, v0, p1

    iget-object v0, v0, Lcom/saterskog/cell_lab/Gene;->u:[I

    const/16 v1, 0x9

    sget-object v2, Lcom/saterskog/cell_lab/Gene;->w:[I

    const/16 v3, 0x9

    aget v2, v2, v3

    add-int/lit8 v2, v2, -0x1

    aput v2, v0, v1

    .line 977
    iget-object v0, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    aget-object v0, v0, p1

    iget-object v0, v0, Lcom/saterskog/cell_lab/Gene;->u:[I

    const/16 v1, 0xb

    const/16 v2, 0x14

    aput v2, v0, v1

    iget-object v0, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    aget-object v0, v0, p1

    iget-object v0, v0, Lcom/saterskog/cell_lab/Gene;->u:[I

    const/16 v1, 0xc

    const/16 v2, 0x0

    aput v2, v0, v1

    iget-object v0, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    aget-object v0, v0, p1

    iget-object v0, v0, Lcom/saterskog/cell_lab/Gene;->u:[I

    const/16 v1, 0xd

    aput p1, v0, v1

    iget-object v0, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    aget-object v0, v0, p1

    iget-object v0, v0, Lcom/saterskog/cell_lab/Gene;->v:[F

    const/16 v1, 0x7

    const/high16 v2, 0x41f00000    # 30.0f

    aput v2, v0, v1

    return-void
.end method

.method private c(Landroid/view/View;I)V
    .locals 2

    .prologue
    .line 1409
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 1410
    if-eqz v0, :cond_0

    .line 1411
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setClickable(Z)V

    .line 1412
    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1413
    invoke-virtual {v0}, Landroid/widget/TextView;->getPaintFlags()I

    move-result v1

    or-int/lit8 v1, v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setPaintFlags(I)V

    .line 1415
    :cond_0
    return-void
.end method

.method static synthetic c(Lcom/saterskog/cell_lab/i;)Z
    .locals 1

    .prologue
    .line 56
    iget-boolean v0, p0, Lcom/saterskog/cell_lab/i;->h:Z

    return v0
.end method

.method static synthetic d(Lcom/saterskog/cell_lab/i;)Landroid/view/View;
    .locals 1

    .prologue
    .line 56
    iget-object v0, p0, Lcom/saterskog/cell_lab/i;->o:Landroid/view/View;

    return-object v0
.end method

.method private d(I)V
    .locals 7

    .prologue
    const/4 v6, 0x1

    const/4 v3, 0x0

    const v2, 0x40c90fdb

    const/high16 v5, 0x3f800000    # 1.0f

    const/4 v4, 0x0

    .line 1863
    iget-object v0, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    aget-object v0, v0, p1

    iget-object v1, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    aget-object v1, v1, p1

    iget v1, v1, Lcom/saterskog/cell_lab/Gene;->d:F

    invoke-static {v1, v4, v2}, Lcom/saterskog/cell_lab/i;->a(FFF)F

    move-result v1

    iput v1, v0, Lcom/saterskog/cell_lab/Gene;->d:F

    .line 1864
    iget-object v0, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    aget-object v0, v0, p1

    iget-object v1, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    aget-object v1, v1, p1

    iget v1, v1, Lcom/saterskog/cell_lab/Gene;->e:F

    invoke-static {v1, v4, v2}, Lcom/saterskog/cell_lab/i;->a(FFF)F

    move-result v1

    iput v1, v0, Lcom/saterskog/cell_lab/Gene;->e:F

    .line 1865
    iget-object v0, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    aget-object v0, v0, p1

    iget-object v1, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    aget-object v1, v1, p1

    iget v1, v1, Lcom/saterskog/cell_lab/Gene;->f:F

    invoke-static {v1, v4, v2}, Lcom/saterskog/cell_lab/i;->a(FFF)F

    move-result v1

    iput v1, v0, Lcom/saterskog/cell_lab/Gene;->f:F

    .line 1866
    iget-object v0, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    aget-object v0, v0, p1

    iget-object v0, v0, Lcom/saterskog/cell_lab/Gene;->a:[F

    iget-object v1, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    aget-object v1, v1, p1

    iget-object v1, v1, Lcom/saterskog/cell_lab/Gene;->a:[F

    aget v1, v1, v3

    invoke-static {v1, v4, v5}, Lcom/saterskog/cell_lab/i;->a(FFF)F

    move-result v1

    aput v1, v0, v3

    .line 1867
    iget-object v0, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    aget-object v0, v0, p1

    iget-object v0, v0, Lcom/saterskog/cell_lab/Gene;->a:[F

    iget-object v1, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    aget-object v1, v1, p1

    iget-object v1, v1, Lcom/saterskog/cell_lab/Gene;->a:[F

    aget v1, v1, v6

    invoke-static {v1, v4, v5}, Lcom/saterskog/cell_lab/i;->a(FFF)F

    move-result v1

    aput v1, v0, v6

    .line 1868
    iget-object v0, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    aget-object v0, v0, p1

    iget-object v0, v0, Lcom/saterskog/cell_lab/Gene;->a:[F

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    aget-object v2, v2, p1

    iget-object v2, v2, Lcom/saterskog/cell_lab/Gene;->a:[F

    const/4 v3, 0x2

    aget v2, v2, v3

    invoke-static {v2, v4, v5}, Lcom/saterskog/cell_lab/i;->a(FFF)F

    move-result v2

    aput v2, v0, v1

    .line 1869
    iget-object v0, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    aget-object v0, v0, p1

    iget-object v1, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    aget-object v1, v1, p1

    iget v1, v1, Lcom/saterskog/cell_lab/Gene;->h:F

    const/high16 v2, 0x420c0000    # 35.0f

    invoke-static {v1, v4, v2}, Lcom/saterskog/cell_lab/i;->a(FFF)F

    move-result v1

    iput v1, v0, Lcom/saterskog/cell_lab/Gene;->h:F

    .line 1871
    iget-object v0, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    aget-object v0, v0, p1

    iget-object v1, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    aget-object v1, v1, p1

    iget v1, v1, Lcom/saterskog/cell_lab/Gene;->b:F

    const v2, 0x3d84b5dd    # 0.0648f

    const v3, 0x3ebc01a3    # 0.3672f

    invoke-static {v1, v2, v3}, Lcom/saterskog/cell_lab/i;->a(FFF)F

    move-result v1

    iput v1, v0, Lcom/saterskog/cell_lab/Gene;->b:F

    .line 1874
    iget-object v0, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    aget-object v0, v0, p1

    iget-object v1, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    aget-object v1, v1, p1

    iget v1, v1, Lcom/saterskog/cell_lab/Gene;->g:F

    float-to-double v2, v1

    invoke-static {v2, v3}, Ljava/lang/Math;->log(D)D

    move-result-wide v2

    double-to-float v1, v2

    const-wide v2, 0x3fb99999a0000000L    # 0.10000000149011612

    invoke-static {v2, v3}, Ljava/lang/Math;->log(D)D

    move-result-wide v2

    double-to-float v2, v2

    const-wide/high16 v4, 0x4024000000000000L    # 10.0

    invoke-static {v4, v5}, Ljava/lang/Math;->log(D)D

    move-result-wide v4

    double-to-float v3, v4

    invoke-static {v1, v2, v3}, Lcom/saterskog/cell_lab/i;->a(FFF)F

    move-result v1

    float-to-double v2, v1

    invoke-static {v2, v3}, Ljava/lang/Math;->exp(D)D

    move-result-wide v2

    double-to-float v1, v2

    iput v1, v0, Lcom/saterskog/cell_lab/Gene;->g:F

    .line 1875
    iget-object v0, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    aget-object v0, v0, p1

    iget-object v1, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    aget-object v1, v1, p1

    iget v1, v1, Lcom/saterskog/cell_lab/Gene;->c:F

    const v2, 0x3dcccccd    # 0.1f

    const v3, 0x3f666666    # 0.9f

    invoke-static {v1, v2, v3}, Lcom/saterskog/cell_lab/i;->a(FFF)F

    move-result v1

    iput v1, v0, Lcom/saterskog/cell_lab/Gene;->c:F

    .line 1877
    return-void
.end method

.method private d(Landroid/view/View;I)V
    .locals 1

    .prologue
    .line 1420
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/SeekBar;

    invoke-virtual {v0, p0}, Landroid/widget/SeekBar;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    .line 1421
    return-void
.end method

.method private d()Z
    .locals 13

    .prologue
    const/4 v5, 0x1

    const v12, 0x40c90fdb

    const/high16 v11, 0x3f800000    # 1.0f

    const/4 v2, 0x0

    const/4 v10, 0x0

    .line 1887
    move v4, v2

    move v0, v5

    .line 1889
    :goto_0
    const/16 v1, 0x50

    if-ge v4, v1, :cond_3

    .line 1891
    iget-object v1, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    aget-object v1, v1, v4

    iget v1, v1, Lcom/saterskog/cell_lab/Gene;->d:F

    float-to-double v6, v1

    iget-object v1, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    aget-object v1, v1, v4

    iget v1, v1, Lcom/saterskog/cell_lab/Gene;->d:F

    invoke-static {v1, v10, v12}, Lcom/saterskog/cell_lab/i;->a(FFF)F

    move-result v1

    float-to-double v8, v1

    invoke-static {v6, v7, v8, v9}, Lcom/saterskog/cell_lab/i;->a(DD)Z

    move-result v1

    and-int/2addr v0, v1

    .line 1892
    iget-object v1, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    aget-object v1, v1, v4

    iget v1, v1, Lcom/saterskog/cell_lab/Gene;->e:F

    float-to-double v6, v1

    iget-object v1, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    aget-object v1, v1, v4

    iget v1, v1, Lcom/saterskog/cell_lab/Gene;->e:F

    invoke-static {v1, v10, v12}, Lcom/saterskog/cell_lab/i;->a(FFF)F

    move-result v1

    float-to-double v8, v1

    invoke-static {v6, v7, v8, v9}, Lcom/saterskog/cell_lab/i;->a(DD)Z

    move-result v1

    and-int/2addr v0, v1

    .line 1893
    iget-object v1, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    aget-object v1, v1, v4

    iget v1, v1, Lcom/saterskog/cell_lab/Gene;->f:F

    float-to-double v6, v1

    iget-object v1, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    aget-object v1, v1, v4

    iget v1, v1, Lcom/saterskog/cell_lab/Gene;->f:F

    invoke-static {v1, v10, v12}, Lcom/saterskog/cell_lab/i;->a(FFF)F

    move-result v1

    float-to-double v8, v1

    invoke-static {v6, v7, v8, v9}, Lcom/saterskog/cell_lab/i;->a(DD)Z

    move-result v1

    and-int/2addr v0, v1

    .line 1894
    iget-object v1, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    aget-object v1, v1, v4

    iget-object v1, v1, Lcom/saterskog/cell_lab/Gene;->a:[F

    aget v1, v1, v2

    float-to-double v6, v1

    iget-object v1, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    aget-object v1, v1, v4

    iget-object v1, v1, Lcom/saterskog/cell_lab/Gene;->a:[F

    aget v1, v1, v2

    invoke-static {v1, v10, v11}, Lcom/saterskog/cell_lab/i;->a(FFF)F

    move-result v1

    float-to-double v8, v1

    invoke-static {v6, v7, v8, v9}, Lcom/saterskog/cell_lab/i;->a(DD)Z

    move-result v1

    and-int/2addr v0, v1

    .line 1895
    iget-object v1, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    aget-object v1, v1, v4

    iget-object v1, v1, Lcom/saterskog/cell_lab/Gene;->a:[F

    aget v1, v1, v5

    float-to-double v6, v1

    iget-object v1, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    aget-object v1, v1, v4

    iget-object v1, v1, Lcom/saterskog/cell_lab/Gene;->a:[F

    aget v1, v1, v5

    invoke-static {v1, v10, v11}, Lcom/saterskog/cell_lab/i;->a(FFF)F

    move-result v1

    float-to-double v8, v1

    invoke-static {v6, v7, v8, v9}, Lcom/saterskog/cell_lab/i;->a(DD)Z

    move-result v1

    and-int/2addr v0, v1

    .line 1896
    iget-object v1, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    aget-object v1, v1, v4

    iget-object v1, v1, Lcom/saterskog/cell_lab/Gene;->a:[F

    const/4 v3, 0x2

    aget v1, v1, v3

    float-to-double v6, v1

    iget-object v1, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    aget-object v1, v1, v4

    iget-object v1, v1, Lcom/saterskog/cell_lab/Gene;->a:[F

    const/4 v3, 0x2

    aget v1, v1, v3

    invoke-static {v1, v10, v11}, Lcom/saterskog/cell_lab/i;->a(FFF)F

    move-result v1

    float-to-double v8, v1

    invoke-static {v6, v7, v8, v9}, Lcom/saterskog/cell_lab/i;->a(DD)Z

    move-result v1

    and-int/2addr v0, v1

    .line 1897
    iget-object v1, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    aget-object v1, v1, v4

    iget v1, v1, Lcom/saterskog/cell_lab/Gene;->h:F

    float-to-double v6, v1

    iget-object v1, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    aget-object v1, v1, v4

    iget v1, v1, Lcom/saterskog/cell_lab/Gene;->h:F

    const/high16 v3, 0x420c0000    # 35.0f

    invoke-static {v1, v10, v3}, Lcom/saterskog/cell_lab/i;->a(FFF)F

    move-result v1

    float-to-double v8, v1

    invoke-static {v6, v7, v8, v9}, Lcom/saterskog/cell_lab/i;->a(DD)Z

    move-result v1

    and-int/2addr v0, v1

    .line 1899
    iget-object v1, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    aget-object v1, v1, v4

    iget v1, v1, Lcom/saterskog/cell_lab/Gene;->b:F

    float-to-double v6, v1

    iget-object v1, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    aget-object v1, v1, v4

    iget v1, v1, Lcom/saterskog/cell_lab/Gene;->b:F

    const v3, 0x3d84b5dd    # 0.0648f

    const v8, 0x3ebc01a3    # 0.3672f

    invoke-static {v1, v3, v8}, Lcom/saterskog/cell_lab/i;->a(FFF)F

    move-result v1

    float-to-double v8, v1

    invoke-static {v6, v7, v8, v9}, Lcom/saterskog/cell_lab/i;->a(DD)Z

    move-result v1

    and-int/2addr v0, v1

    .line 1901
    iget-object v1, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    aget-object v1, v1, v4

    iget v1, v1, Lcom/saterskog/cell_lab/Gene;->g:F

    float-to-double v6, v1

    iget-object v1, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    aget-object v1, v1, v4

    iget v1, v1, Lcom/saterskog/cell_lab/Gene;->g:F

    float-to-double v8, v1

    invoke-static {v8, v9}, Ljava/lang/Math;->log(D)D

    move-result-wide v8

    double-to-float v1, v8

    const-wide v8, 0x3fb99999a0000000L    # 0.10000000149011612

    invoke-static {v8, v9}, Ljava/lang/Math;->log(D)D

    move-result-wide v8

    double-to-float v3, v8

    const-wide/high16 v8, 0x4024000000000000L    # 10.0

    invoke-static {v8, v9}, Ljava/lang/Math;->log(D)D

    move-result-wide v8

    double-to-float v8, v8

    invoke-static {v1, v3, v8}, Lcom/saterskog/cell_lab/i;->a(FFF)F

    move-result v1

    float-to-double v8, v1

    invoke-static {v8, v9}, Ljava/lang/Math;->exp(D)D

    move-result-wide v8

    double-to-float v1, v8

    float-to-double v8, v1

    invoke-static {v6, v7, v8, v9}, Lcom/saterskog/cell_lab/i;->a(DD)Z

    move-result v1

    and-int/2addr v0, v1

    .line 1903
    iget-object v1, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    aget-object v1, v1, v4

    iget v1, v1, Lcom/saterskog/cell_lab/Gene;->c:F

    float-to-double v6, v1

    iget-object v1, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    aget-object v1, v1, v4

    iget v1, v1, Lcom/saterskog/cell_lab/Gene;->c:F

    const v3, 0x3dcccccd    # 0.1f

    const v8, 0x3f666666    # 0.9f

    invoke-static {v1, v3, v8}, Lcom/saterskog/cell_lab/i;->a(FFF)F

    move-result v1

    float-to-double v8, v1

    invoke-static {v6, v7, v8, v9}, Lcom/saterskog/cell_lab/i;->a(DD)Z

    move-result v1

    and-int/2addr v0, v1

    move v1, v2

    .line 1906
    :goto_1
    const/4 v3, 0x7

    if-ge v1, v3, :cond_0

    .line 1907
    iget-object v3, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    aget-object v3, v3, v4

    iget-object v3, v3, Lcom/saterskog/cell_lab/Gene;->v:[F

    aget v3, v3, v1

    float-to-double v6, v3

    iget-object v3, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    aget-object v3, v3, v4

    iget-object v3, v3, Lcom/saterskog/cell_lab/Gene;->v:[F

    aget v3, v3, v1

    sget-object v8, Lcom/saterskog/cell_lab/Gene;->z:[F

    aget v8, v8, v1

    sget-object v9, Lcom/saterskog/cell_lab/Gene;->A:[F

    aget v9, v9, v1

    invoke-static {v3, v8, v9}, Lcom/saterskog/cell_lab/i;->a(FFF)F

    move-result v3

    float-to-double v8, v3

    invoke-static {v6, v7, v8, v9}, Lcom/saterskog/cell_lab/i;->a(DD)Z

    move-result v3

    and-int/2addr v3, v0

    .line 1906
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    move v0, v3

    goto :goto_1

    :cond_0
    move v1, v2

    .line 1909
    :goto_2
    const/16 v3, 0xb

    if-ge v1, v3, :cond_2

    .line 1910
    iget-object v3, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    aget-object v3, v3, v4

    iget-object v3, v3, Lcom/saterskog/cell_lab/Gene;->t:[Lcom/saterskog/cell_lab/Gene$a;

    aget-object v3, v3, v1

    iget-short v3, v3, Lcom/saterskog/cell_lab/Gene$a;->d:S

    const/4 v6, -0x1

    if-ne v3, v6, :cond_1

    .line 1911
    iget-object v3, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    aget-object v3, v3, v4

    iget-object v3, v3, Lcom/saterskog/cell_lab/Gene;->t:[Lcom/saterskog/cell_lab/Gene$a;

    aget-object v3, v3, v1

    iget v3, v3, Lcom/saterskog/cell_lab/Gene$a;->b:F

    float-to-double v6, v3

    iget-object v3, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    aget-object v3, v3, v4

    iget-object v3, v3, Lcom/saterskog/cell_lab/Gene;->t:[Lcom/saterskog/cell_lab/Gene$a;

    aget-object v3, v3, v1

    iget v3, v3, Lcom/saterskog/cell_lab/Gene$a;->b:F

    const/high16 v8, -0x40800000    # -1.0f

    invoke-static {v3, v8, v11}, Lcom/saterskog/cell_lab/i;->a(FFF)F

    move-result v3

    float-to-double v8, v3

    invoke-static {v6, v7, v8, v9}, Lcom/saterskog/cell_lab/i;->a(DD)Z

    move-result v3

    and-int/2addr v0, v3

    .line 1909
    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    .line 1889
    :cond_2
    add-int/lit8 v1, v4, 0x1

    move v4, v1

    goto/16 :goto_0

    .line 1917
    :cond_3
    return v0
.end method

.method private e(Landroid/view/View;I)V
    .locals 1

    .prologue
    .line 1423
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    invoke-virtual {v0, p0}, Landroid/widget/CheckBox;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 1424
    return-void
.end method

.method static synthetic e(Lcom/saterskog/cell_lab/i;)Z
    .locals 1

    .prologue
    .line 56
    iget-boolean v0, p0, Lcom/saterskog/cell_lab/i;->g:Z

    return v0
.end method


# virtual methods
.method final a(IZ)F
    .locals 8

    .prologue
    const/4 v0, 0x0

    const-wide v6, 0x4058406020000000L    # 97.00586700439453

    const-wide v4, 0x3fb51cb440000000L    # 0.08246923983097076

    const/high16 v3, 0x3f800000    # 1.0f

    .line 269
    if-nez p2, :cond_2

    .line 270
    iget v1, p0, Lcom/saterskog/cell_lab/i;->l:I

    div-int/lit8 v1, v1, 0x2

    if-ne p1, v1, :cond_1

    .line 278
    :cond_0
    :goto_0
    return v0

    .line 271
    :cond_1
    iget v0, p0, Lcom/saterskog/cell_lab/i;->l:I

    div-int/lit8 v0, v0, 0x2

    sub-int v0, p1, v0

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v0

    int-to-float v0, v0

    .line 272
    sub-float/2addr v0, v3

    iget v1, p0, Lcom/saterskog/cell_lab/i;->l:I

    int-to-float v1, v1

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    sub-float/2addr v1, v3

    div-float/2addr v0, v1

    float-to-double v0, v0

    invoke-static {v6, v7, v0, v1}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v0

    mul-double/2addr v0, v4

    iget v2, p0, Lcom/saterskog/cell_lab/i;->l:I

    div-int/lit8 v2, v2, 0x2

    sub-int v2, p1, v2

    int-to-float v2, v2

    invoke-static {v2}, Ljava/lang/Math;->signum(F)F

    move-result v2

    float-to-double v2, v2

    mul-double/2addr v0, v2

    double-to-float v0, v0

    goto :goto_0

    .line 276
    :cond_2
    if-eqz p1, :cond_0

    .line 277
    int-to-float v0, p1

    .line 278
    sub-float/2addr v0, v3

    iget v1, p0, Lcom/saterskog/cell_lab/i;->l:I

    int-to-float v1, v1

    sub-float/2addr v1, v3

    div-float/2addr v0, v1

    float-to-double v0, v0

    invoke-static {v6, v7, v0, v1}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v0

    mul-double/2addr v0, v4

    double-to-float v0, v0

    goto :goto_0
.end method

.method final a(FZ)I
    .locals 9

    .prologue
    const/high16 v8, 0x3f800000    # 1.0f

    const/4 v0, 0x0

    const-wide v4, 0x4058406020000000L    # 97.00586700439453

    const-wide/high16 v6, 0x3ff0000000000000L    # 1.0

    .line 284
    if-nez p2, :cond_1

    .line 285
    cmpl-float v0, p1, v0

    if-nez v0, :cond_0

    iget v0, p0, Lcom/saterskog/cell_lab/i;->l:I

    div-int/lit8 v0, v0, 0x2

    .line 291
    :goto_0
    return v0

    .line 286
    :cond_0
    iget v0, p0, Lcom/saterskog/cell_lab/i;->l:I

    div-int/lit8 v0, v0, 0x2

    int-to-double v0, v0

    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result v2

    const v3, 0x3da8e5a2

    div-float/2addr v2, v3

    float-to-double v2, v2

    invoke-static {v2, v3}, Ljava/lang/Math;->log(D)D

    move-result-wide v2

    invoke-static {v4, v5}, Ljava/lang/Math;->log(D)D

    move-result-wide v4

    div-double/2addr v2, v4

    iget v4, p0, Lcom/saterskog/cell_lab/i;->l:I

    int-to-float v4, v4

    const/high16 v5, 0x40000000    # 2.0f

    div-float/2addr v4, v5

    sub-float/2addr v4, v8

    float-to-double v4, v4

    mul-double/2addr v2, v4

    add-double/2addr v2, v6

    invoke-static {p1}, Ljava/lang/Math;->signum(F)F

    move-result v4

    float-to-double v4, v4

    mul-double/2addr v2, v4

    add-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->round(D)J

    move-result-wide v0

    long-to-int v0, v0

    goto :goto_0

    .line 290
    :cond_1
    cmpl-float v0, p1, v0

    if-nez v0, :cond_2

    const/4 v0, 0x0

    goto :goto_0

    .line 291
    :cond_2
    const/high16 v0, 0x41000000    # 8.0f

    add-float/2addr v0, p1

    float-to-double v0, v0

    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    mul-double/2addr v0, v2

    const-wide v2, 0x3fb51cb440000000L    # 0.08246923983097076

    div-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->log(D)D

    move-result-wide v0

    invoke-static {v4, v5}, Ljava/lang/Math;->log(D)D

    move-result-wide v2

    div-double/2addr v0, v2

    iget v2, p0, Lcom/saterskog/cell_lab/i;->l:I

    int-to-float v2, v2

    sub-float/2addr v2, v8

    float-to-double v2, v2

    mul-double/2addr v0, v2

    add-double/2addr v0, v6

    invoke-static {v0, v1}, Ljava/lang/Math;->round(D)J

    move-result-wide v0

    long-to-int v0, v0

    goto :goto_0
.end method

.method final a()V
    .locals 10

    .prologue
    const/16 v9, 0x50

    .line 1599
    iget-boolean v0, p0, Lcom/saterskog/cell_lab/i;->i:Z

    if-eqz v0, :cond_1

    .line 1631
    :cond_0
    return-void

    .line 1600
    :cond_1
    iget-object v0, p0, Lcom/saterskog/cell_lab/i;->m:Lcom/saterskog/cell_lab/GenomePreviewView;

    if-eqz v0, :cond_3

    iget-object v1, p0, Lcom/saterskog/cell_lab/i;->m:Lcom/saterskog/cell_lab/GenomePreviewView;

    iget-object v6, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    iget v3, p0, Lcom/saterskog/cell_lab/i;->c:I

    iget-wide v4, p0, Lcom/saterskog/cell_lab/i;->n:D

    .line 6090
    new-array v2, v9, [Lcom/saterskog/cell_lab/Gene;

    .line 6092
    const/4 v0, 0x0

    :goto_0
    if-ge v0, v9, :cond_2

    .line 6093
    new-instance v7, Lcom/saterskog/cell_lab/Gene;

    aget-object v8, v6, v0

    invoke-direct {v7, v8}, Lcom/saterskog/cell_lab/Gene;-><init>(Lcom/saterskog/cell_lab/Gene;)V

    aput-object v7, v2, v0

    .line 6092
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 6094
    :cond_2
    new-instance v0, Lcom/saterskog/cell_lab/GenomePreviewView$1;

    invoke-direct/range {v0 .. v5}, Lcom/saterskog/cell_lab/GenomePreviewView$1;-><init>(Lcom/saterskog/cell_lab/GenomePreviewView;[Lcom/saterskog/cell_lab/Gene;ID)V

    invoke-virtual {v1, v0}, Lcom/saterskog/cell_lab/GenomePreviewView;->queueEvent(Ljava/lang/Runnable;)V

    .line 6104
    invoke-virtual {v1}, Lcom/saterskog/cell_lab/GenomePreviewView;->requestRender()V

    .line 1602
    :cond_3
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v0

    .line 1603
    if-eqz v0, :cond_0

    .line 1604
    const v1, 0x7f0800bf

    invoke-virtual {v0, v1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Spinner;

    .line 1605
    if-eqz v0, :cond_4

    .line 1606
    invoke-virtual {v0}, Landroid/widget/Spinner;->getSelectedView()Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 1607
    iget v1, p0, Lcom/saterskog/cell_lab/i;->c:I

    invoke-virtual {p0, v0, v1}, Lcom/saterskog/cell_lab/i;->a(Landroid/widget/TextView;I)V

    .line 1609
    :cond_4
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v0

    const v1, 0x7f0800c0

    invoke-virtual {v0, v1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Spinner;

    .line 1610
    if-eqz v0, :cond_5

    iget v1, p0, Lcom/saterskog/cell_lab/i;->c:I

    iget-object v2, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    iget v3, p0, Lcom/saterskog/cell_lab/i;->c:I

    aget-object v2, v2, v3

    iget v2, v2, Lcom/saterskog/cell_lab/Gene;->i:I

    if-ne v1, v2, :cond_5

    .line 1611
    invoke-virtual {v0}, Landroid/widget/Spinner;->getSelectedView()Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 1612
    iget v1, p0, Lcom/saterskog/cell_lab/i;->c:I

    invoke-virtual {p0, v0, v1}, Lcom/saterskog/cell_lab/i;->a(Landroid/widget/TextView;I)V

    .line 1614
    :cond_5
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v0

    const v1, 0x7f0800c2

    invoke-virtual {v0, v1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Spinner;

    .line 1615
    if-eqz v0, :cond_6

    iget v1, p0, Lcom/saterskog/cell_lab/i;->c:I

    iget-object v2, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    iget v3, p0, Lcom/saterskog/cell_lab/i;->c:I

    aget-object v2, v2, v3

    iget v2, v2, Lcom/saterskog/cell_lab/Gene;->j:I

    if-ne v1, v2, :cond_6

    .line 1617
    invoke-virtual {v0}, Landroid/widget/Spinner;->getSelectedView()Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 1618
    iget v1, p0, Lcom/saterskog/cell_lab/i;->c:I

    invoke-virtual {p0, v0, v1}, Lcom/saterskog/cell_lab/i;->a(Landroid/widget/TextView;I)V

    .line 1620
    :cond_6
    iget-object v0, p0, Lcom/saterskog/cell_lab/i;->q:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_7
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/saterskog/cell_lab/i$e;

    .line 1621
    instance-of v2, v0, Lcom/saterskog/cell_lab/i$c;

    if-eqz v2, :cond_7

    iget v2, v0, Lcom/saterskog/cell_lab/i$e;->h:I

    if-eqz v2, :cond_8

    iget v2, v0, Lcom/saterskog/cell_lab/i$e;->h:I

    const/16 v3, 0xd

    if-eq v2, v3, :cond_8

    const/4 v3, 0x1

    if-ne v2, v3, :cond_7

    .line 1622
    :cond_8
    check-cast v0, Lcom/saterskog/cell_lab/i$c;

    .line 1624
    iget-object v2, v0, Lcom/saterskog/cell_lab/i$c;->a:Landroid/widget/Spinner;

    if-eqz v2, :cond_7

    iget v2, p0, Lcom/saterskog/cell_lab/i;->c:I

    iget-object v3, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    iget v4, p0, Lcom/saterskog/cell_lab/i;->c:I

    aget-object v3, v3, v4

    iget-object v3, v3, Lcom/saterskog/cell_lab/Gene;->u:[I

    iget v4, v0, Lcom/saterskog/cell_lab/i$c;->h:I

    aget v3, v3, v4

    if-ne v2, v3, :cond_7

    .line 1626
    iget-object v0, v0, Lcom/saterskog/cell_lab/i$c;->a:Landroid/widget/Spinner;

    invoke-virtual {v0}, Landroid/widget/Spinner;->getSelectedView()Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 1627
    iget v2, p0, Lcom/saterskog/cell_lab/i;->c:I

    invoke-virtual {p0, v0, v2}, Lcom/saterskog/cell_lab/i;->a(Landroid/widget/TextView;I)V

    goto :goto_1
.end method

.method public final a(I)V
    .locals 2

    .prologue
    .line 891
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v0

    new-instance v1, Lcom/saterskog/cell_lab/i$1;

    invoke-direct {v1, p0, p1}, Lcom/saterskog/cell_lab/i$1;-><init>(Lcom/saterskog/cell_lab/i;I)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 902
    return-void
.end method

.method final a(Landroid/widget/TextView;I)V
    .locals 9

    .prologue
    const v8, 0x7f0e00b5

    const/16 v5, 0xff

    const-wide/high16 v6, 0x4070000000000000L    # 256.0

    const/4 v4, 0x0

    .line 1588
    if-eqz p1, :cond_0

    .line 1589
    iget-object v0, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    aget-object v0, v0, p2

    iget-object v0, v0, Lcom/saterskog/cell_lab/Gene;->a:[F

    aget v0, v0, v4

    float-to-double v0, v0

    mul-double/2addr v0, v6

    double-to-int v0, v0

    invoke-static {v4, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    invoke-static {v5, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    iget-object v1, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    aget-object v1, v1, p2

    iget-object v1, v1, Lcom/saterskog/cell_lab/Gene;->a:[F

    const/4 v2, 0x1

    aget v1, v1, v2

    float-to-double v2, v1

    mul-double/2addr v2, v6

    double-to-int v1, v2

    .line 1590
    invoke-static {v4, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    invoke-static {v5, v1}, Ljava/lang/Math;->min(II)I

    move-result v1

    iget-object v2, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    aget-object v2, v2, p2

    iget-object v2, v2, Lcom/saterskog/cell_lab/Gene;->a:[F

    const/4 v3, 0x2

    aget v2, v2, v3

    float-to-double v2, v2

    mul-double/2addr v2, v6

    double-to-int v2, v2

    .line 1591
    invoke-static {v4, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    invoke-static {v5, v2}, Ljava/lang/Math;->min(II)I

    move-result v2

    .line 1589
    invoke-static {v0, v1, v2}, Landroid/graphics/Color;->rgb(III)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1592
    iget-boolean v0, p0, Lcom/saterskog/cell_lab/i;->k:Z

    if-eqz v0, :cond_1

    .line 1593
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, v8}, Lcom/saterskog/cell_lab/i;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    add-int/lit8 v1, p2, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/saterskog/cell_lab/i;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f020002

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    aget-object v2, v2, p2

    iget-object v2, v2, Lcom/saterskog/cell_lab/Gene;->s:Lcom/saterskog/cell_lab/h;

    invoke-virtual {v2}, Lcom/saterskog/cell_lab/h;->ordinal()I

    move-result v2

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1597
    :cond_0
    :goto_0
    return-void

    .line 1595
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, v8}, Lcom/saterskog/cell_lab/i;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    add-int/lit8 v1, p2, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0
.end method

.method public final a(ZZ)V
    .locals 11

    .prologue
    const/4 v10, 0x1

    const/4 v1, 0x0

    const-wide v8, 0x401921fb54442d18L    # 6.283185307179586

    const-wide/high16 v4, 0x4028000000000000L    # 12.0

    const-wide/high16 v6, 0x3fd0000000000000L    # 0.25

    .line 1657
    iget-boolean v0, p0, Lcom/saterskog/cell_lab/i;->i:Z

    if-eqz v0, :cond_0

    .line 1727
    :goto_0
    return-void

    .line 1658
    :cond_0
    iput-boolean v10, p0, Lcom/saterskog/cell_lab/i;->j:Z

    .line 1659
    iget-object v0, p0, Lcom/saterskog/cell_lab/i;->q:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/saterskog/cell_lab/i$e;

    invoke-virtual {v0}, Lcom/saterskog/cell_lab/i$e;->b()V

    goto :goto_1

    .line 1661
    :cond_1
    iget-wide v2, p0, Lcom/saterskog/cell_lab/i;->n:D

    cmpg-double v0, v2, v4

    if-gez v0, :cond_c

    .line 1662
    const v0, 0x7f0800b0

    iget-wide v2, p0, Lcom/saterskog/cell_lab/i;->n:D

    mul-double/2addr v2, v6

    const-wide/high16 v4, 0x4018000000000000L    # 6.0

    div-double/2addr v2, v4

    invoke-direct {p0, v0, v2, v3}, Lcom/saterskog/cell_lab/i;->a(ID)V

    .line 1665
    :goto_2
    const v0, 0x7f0800aa

    iget-object v2, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    iget v3, p0, Lcom/saterskog/cell_lab/i;->c:I

    aget-object v2, v2, v3

    iget-object v2, v2, Lcom/saterskog/cell_lab/Gene;->a:[F

    aget v2, v2, v1

    float-to-double v2, v2

    invoke-direct {p0, v0, v2, v3}, Lcom/saterskog/cell_lab/i;->a(ID)V

    .line 1666
    const v0, 0x7f0800a2

    iget-object v2, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    iget v3, p0, Lcom/saterskog/cell_lab/i;->c:I

    aget-object v2, v2, v3

    iget-object v2, v2, Lcom/saterskog/cell_lab/Gene;->a:[F

    aget v2, v2, v10

    float-to-double v2, v2

    invoke-direct {p0, v0, v2, v3}, Lcom/saterskog/cell_lab/i;->a(ID)V

    .line 1667
    const v0, 0x7f08009c

    iget-object v2, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    iget v3, p0, Lcom/saterskog/cell_lab/i;->c:I

    aget-object v2, v2, v3

    iget-object v2, v2, Lcom/saterskog/cell_lab/Gene;->a:[F

    const/4 v3, 0x2

    aget v2, v2, v3

    float-to-double v2, v2

    invoke-direct {p0, v0, v2, v3}, Lcom/saterskog/cell_lab/i;->a(ID)V

    .line 1668
    const v0, 0x7f08009e

    iget-object v2, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    iget v3, p0, Lcom/saterskog/cell_lab/i;->c:I

    aget-object v2, v2, v3

    iget v2, v2, Lcom/saterskog/cell_lab/Gene;->e:F

    float-to-double v2, v2

    div-double/2addr v2, v8

    invoke-direct {p0, v0, v2, v3}, Lcom/saterskog/cell_lab/i;->a(ID)V

    .line 1669
    const v0, 0x7f0800a0

    iget-object v2, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    iget v3, p0, Lcom/saterskog/cell_lab/i;->c:I

    aget-object v2, v2, v3

    iget v2, v2, Lcom/saterskog/cell_lab/Gene;->f:F

    float-to-double v2, v2

    div-double/2addr v2, v8

    invoke-direct {p0, v0, v2, v3}, Lcom/saterskog/cell_lab/i;->a(ID)V

    .line 1671
    const v0, 0x7f0800a4

    iget-object v2, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    iget v3, p0, Lcom/saterskog/cell_lab/i;->c:I

    aget-object v2, v2, v3

    iget v2, v2, Lcom/saterskog/cell_lab/Gene;->b:F

    const v3, 0x3d84b5dd    # 0.0648f

    sub-float/2addr v2, v3

    const v3, 0x3e9ad42c    # 0.3024f

    div-float/2addr v2, v3

    float-to-double v2, v2

    invoke-direct {p0, v0, v2, v3}, Lcom/saterskog/cell_lab/i;->a(ID)V

    .line 1672
    const v0, 0x7f0800a7

    iget-object v2, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    iget v3, p0, Lcom/saterskog/cell_lab/i;->c:I

    aget-object v2, v2, v3

    iget v2, v2, Lcom/saterskog/cell_lab/Gene;->g:F

    float-to-double v2, v2

    .line 6585
    const-wide v4, 0x3fb99999a0000000L    # 0.10000000149011612

    div-double/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Math;->log(D)D

    move-result-wide v2

    const-wide v4, 0x4058fffff9c00002L    # 99.99999850988391

    invoke-static {v4, v5}, Ljava/lang/Math;->log(D)D

    move-result-wide v4

    div-double/2addr v2, v4

    .line 1672
    invoke-direct {p0, v0, v2, v3}, Lcom/saterskog/cell_lab/i;->a(ID)V

    .line 1673
    const v0, 0x7f0800a9

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    iget-object v4, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    iget v5, p0, Lcom/saterskog/cell_lab/i;->c:I

    aget-object v4, v4, v5

    iget v4, v4, Lcom/saterskog/cell_lab/Gene;->c:F

    const v5, 0x3dcccccd    # 0.1f

    sub-float/2addr v4, v5

    const v5, 0x3f4ccccd    # 0.8f

    div-float/2addr v4, v5

    float-to-double v4, v4

    sub-double/2addr v2, v4

    invoke-direct {p0, v0, v2, v3}, Lcom/saterskog/cell_lab/i;->a(ID)V

    .line 1674
    const v0, 0x7f0800ac

    iget-object v2, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    iget v3, p0, Lcom/saterskog/cell_lab/i;->c:I

    aget-object v2, v2, v3

    iget v2, v2, Lcom/saterskog/cell_lab/Gene;->d:F

    float-to-double v2, v2

    div-double/2addr v2, v8

    invoke-direct {p0, v0, v2, v3}, Lcom/saterskog/cell_lab/i;->a(ID)V

    .line 1675
    const v0, 0x7f0800ae

    iget-object v2, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    iget v3, p0, Lcom/saterskog/cell_lab/i;->c:I

    aget-object v2, v2, v3

    iget v2, v2, Lcom/saterskog/cell_lab/Gene;->h:F

    const/high16 v3, 0x420c0000    # 35.0f

    cmpl-float v4, v2, v3

    if-ltz v4, :cond_2

    const/high16 v2, 0x3f800000    # 1.0f

    goto :goto_3

    :cond_2
    div-float/2addr v2, v3

    :goto_3
    float-to-double v2, v2

    invoke-direct {p0, v0, v2, v3}, Lcom/saterskog/cell_lab/i;->a(ID)V

    .line 1679
    if-eqz p2, :cond_3

    const v0, 0x7f0800bf

    iget v2, p0, Lcom/saterskog/cell_lab/i;->c:I

    invoke-direct {p0, v0, v2}, Lcom/saterskog/cell_lab/i;->a(II)V

    .line 1680
    :cond_3
    if-eqz p1, :cond_4

    const v0, 0x7f0800c6

    iget-object v2, p0, Lcom/saterskog/cell_lab/i;->e:Ljava/util/ArrayList;

    iget-object v3, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    iget v4, p0, Lcom/saterskog/cell_lab/i;->c:I

    aget-object v3, v3, v4

    iget-object v3, v3, Lcom/saterskog/cell_lab/Gene;->s:Lcom/saterskog/cell_lab/h;

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result v2

    invoke-direct {p0, v0, v2}, Lcom/saterskog/cell_lab/i;->a(II)V

    .line 1681
    :cond_4
    const v0, 0x7f0800c0

    iget-object v2, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    iget v3, p0, Lcom/saterskog/cell_lab/i;->c:I

    aget-object v2, v2, v3

    iget v2, v2, Lcom/saterskog/cell_lab/Gene;->i:I

    invoke-direct {p0, v0, v2}, Lcom/saterskog/cell_lab/i;->a(II)V

    .line 1682
    const v0, 0x7f0800c2

    iget-object v2, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    iget v3, p0, Lcom/saterskog/cell_lab/i;->c:I

    aget-object v2, v2, v3

    iget v2, v2, Lcom/saterskog/cell_lab/Gene;->j:I

    invoke-direct {p0, v0, v2}, Lcom/saterskog/cell_lab/i;->a(II)V

    .line 1691
    const v0, 0x7f080027

    iget-object v2, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    iget v3, p0, Lcom/saterskog/cell_lab/i;->c:I

    aget-object v2, v2, v3

    iget-boolean v2, v2, Lcom/saterskog/cell_lab/Gene;->l:Z

    invoke-direct {p0, v0, v2}, Lcom/saterskog/cell_lab/i;->b(IZ)V

    .line 1692
    const v0, 0x7f08002b

    iget-object v2, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    iget v3, p0, Lcom/saterskog/cell_lab/i;->c:I

    aget-object v2, v2, v3

    iget-boolean v2, v2, Lcom/saterskog/cell_lab/Gene;->o:Z

    invoke-direct {p0, v0, v2}, Lcom/saterskog/cell_lab/i;->b(IZ)V

    .line 1693
    const v0, 0x7f080025

    iget-object v2, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    iget v3, p0, Lcom/saterskog/cell_lab/i;->c:I

    aget-object v2, v2, v3

    iget-boolean v2, v2, Lcom/saterskog/cell_lab/Gene;->m:Z

    invoke-direct {p0, v0, v2}, Lcom/saterskog/cell_lab/i;->b(IZ)V

    .line 1694
    const v0, 0x7f080026

    iget-object v2, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    iget v3, p0, Lcom/saterskog/cell_lab/i;->c:I

    aget-object v2, v2, v3

    iget-boolean v2, v2, Lcom/saterskog/cell_lab/Gene;->n:Z

    invoke-direct {p0, v0, v2}, Lcom/saterskog/cell_lab/i;->b(IZ)V

    .line 1695
    const v0, 0x7f080028

    iget-object v2, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    iget v3, p0, Lcom/saterskog/cell_lab/i;->c:I

    aget-object v2, v2, v3

    iget-boolean v2, v2, Lcom/saterskog/cell_lab/Gene;->q:Z

    invoke-direct {p0, v0, v2}, Lcom/saterskog/cell_lab/i;->b(IZ)V

    .line 1696
    const v0, 0x7f080029

    iget-object v2, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    iget v3, p0, Lcom/saterskog/cell_lab/i;->c:I

    aget-object v2, v2, v3

    iget-boolean v2, v2, Lcom/saterskog/cell_lab/Gene;->r:Z

    invoke-direct {p0, v0, v2}, Lcom/saterskog/cell_lab/i;->b(IZ)V

    .line 1697
    const v0, 0x7f08002a

    iget-boolean v2, p0, Lcom/saterskog/cell_lab/i;->h:Z

    invoke-direct {p0, v0, v2}, Lcom/saterskog/cell_lab/i;->b(IZ)V

    .line 1699
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v0

    const v2, 0x7f080064

    invoke-virtual {v0, v2}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RadioButton;

    .line 1700
    if-eqz v0, :cond_5

    iget-object v2, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    iget v3, p0, Lcom/saterskog/cell_lab/i;->c:I

    aget-object v2, v2, v3

    iget-boolean v2, v2, Lcom/saterskog/cell_lab/Gene;->p:Z

    invoke-virtual {v0, v2}, Landroid/widget/RadioButton;->setChecked(Z)V

    .line 1706
    :cond_5
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v0

    const v2, 0x7f0800ae

    invoke-virtual {v0, v2}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/SeekBar;

    .line 1707
    if-eqz v0, :cond_9

    .line 1708
    iget-object v2, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    iget v3, p0, Lcom/saterskog/cell_lab/i;->c:I

    aget-object v2, v2, v3

    iget-boolean v2, v2, Lcom/saterskog/cell_lab/Gene;->l:Z

    invoke-virtual {v0, v2}, Landroid/widget/SeekBar;->setEnabled(Z)V

    iget-object v2, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    iget v3, p0, Lcom/saterskog/cell_lab/i;->c:I

    aget-object v4, v2, v3

    iget-object v4, v4, Lcom/saterskog/cell_lab/Gene;->s:Lcom/saterskog/cell_lab/h;

    sget-object v3, Lcom/saterskog/cell_lab/h;->modded_cell:Lcom/saterskog/cell_lab/h;

    if-eq v4, v3, :cond_7

    iget-object v2, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    iget v3, p0, Lcom/saterskog/cell_lab/i;->c:I

    aget-object v4, v2, v3

    iget v8, v4, Lcom/saterskog/cell_lab/Gene;->i:I

    iget-object v2, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    aget-object v4, v2, v8

    iget-object v4, v4, Lcom/saterskog/cell_lab/Gene;->s:Lcom/saterskog/cell_lab/h;

    sget-object v3, Lcom/saterskog/cell_lab/h;->modded_cell:Lcom/saterskog/cell_lab/h;

    if-ne v4, v3, :cond_6

    :goto_4
    const v2, 0x0

    invoke-virtual {v0, v2}, Landroid/widget/SeekBar;->setEnabled(Z)V

    goto :goto_5

    :cond_6
    iget-object v2, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    iget v3, p0, Lcom/saterskog/cell_lab/i;->c:I

    aget-object v4, v2, v3

    iget v8, v4, Lcom/saterskog/cell_lab/Gene;->j:I

    iget-object v2, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    aget-object v4, v2, v8

    iget-object v4, v4, Lcom/saterskog/cell_lab/Gene;->s:Lcom/saterskog/cell_lab/h;

    sget-object v3, Lcom/saterskog/cell_lab/h;->modded_cell:Lcom/saterskog/cell_lab/h;

    if-ne v4, v3, :cond_9

    goto :goto_4

    :cond_7
    iget-object v2, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    iget v3, p0, Lcom/saterskog/cell_lab/i;->c:I

    aget-object v4, v2, v3

    iget v8, v4, Lcom/saterskog/cell_lab/Gene;->i:I

    iget-object v2, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    aget-object v4, v2, v8

    iget-object v4, v4, Lcom/saterskog/cell_lab/Gene;->s:Lcom/saterskog/cell_lab/h;

    sget-object v3, Lcom/saterskog/cell_lab/h;->modded_cell:Lcom/saterskog/cell_lab/h;

    if-ne v4, v3, :cond_8

    iget-object v2, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    iget v3, p0, Lcom/saterskog/cell_lab/i;->c:I

    aget-object v4, v2, v3

    iget v8, v4, Lcom/saterskog/cell_lab/Gene;->j:I

    iget-object v2, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    aget-object v4, v2, v8

    iget-object v4, v4, Lcom/saterskog/cell_lab/Gene;->s:Lcom/saterskog/cell_lab/h;

    sget-object v3, Lcom/saterskog/cell_lab/h;->modded_cell:Lcom/saterskog/cell_lab/h;

    if-ne v4, v3, :cond_8

    goto :goto_4

    :cond_8
    const v2, 0x1

    invoke-virtual {v0, v2}, Landroid/widget/SeekBar;->setEnabled(Z)V

    .line 1709
    :cond_9
    :goto_5
    iget-object v0, p0, Lcom/saterskog/cell_lab/i;->p:Lcom/saterskog/cell_lab/i$a;

    if-eqz v0, :cond_a

    .line 1710
    iget-object v0, p0, Lcom/saterskog/cell_lab/i;->p:Lcom/saterskog/cell_lab/i$a;

    iget-object v2, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    iget v3, p0, Lcom/saterskog/cell_lab/i;->c:I

    aget-object v2, v2, v3

    iget-boolean v2, v2, Lcom/saterskog/cell_lab/Gene;->l:Z

    invoke-virtual {v0, v2}, Lcom/saterskog/cell_lab/i$a;->a(Z)V

    .line 1713
    :cond_a
    iget-object v0, p0, Lcom/saterskog/cell_lab/i;->b:Landroid/widget/Button;

    if-eqz v0, :cond_b

    .line 1714
    iget-object v2, p0, Lcom/saterskog/cell_lab/i;->b:Landroid/widget/Button;

    iget-object v0, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    iget v3, p0, Lcom/saterskog/cell_lab/i;->c:I

    aget-object v0, v0, v3

    iget-object v0, v0, Lcom/saterskog/cell_lab/Gene;->s:Lcom/saterskog/cell_lab/h;

    sget-object v3, Lcom/saterskog/cell_lab/h;->n:Lcom/saterskog/cell_lab/h;

    if-ne v0, v3, :cond_d

    move v0, v1

    :goto_6
    invoke-virtual {v2, v0}, Landroid/widget/Button;->setVisibility(I)V

    .line 1726
    :cond_b
    iput-boolean v1, p0, Lcom/saterskog/cell_lab/i;->j:Z

    goto/16 :goto_0

    .line 1664
    :cond_c
    const v0, 0x7f0800b0

    iget-wide v2, p0, Lcom/saterskog/cell_lab/i;->n:D

    const-wide/high16 v4, 0x4018000000000000L    # 6.0

    sub-double/2addr v2, v4

    mul-double/2addr v2, v6

    const-wide/high16 v4, 0x4045000000000000L    # 42.0

    div-double/2addr v2, v4

    const-wide/high16 v6, 0x3fe0000000000000L    # 0.5

    add-double/2addr v2, v6

    invoke-direct {p0, v0, v2, v3}, Lcom/saterskog/cell_lab/i;->a(ID)V

    goto/16 :goto_2

    .line 1714
    :cond_d
    const/16 v0, 0x8

    goto :goto_6
.end method

.method public final b(I)Z
    .locals 12

    .prologue
    .line 2144
    if-nez p1, :cond_0

    .line 2146
    iget-object v0, p0, Lcom/saterskog/cell_lab/i;->f:Lcom/saterskog/cell_lab/i$b;

    invoke-interface {v0}, Lcom/saterskog/cell_lab/i$b;->a()[Lcom/saterskog/cell_lab/Gene;

    move-result-object v1

    .line 2147
    if-nez v1, :cond_6

    .line 2150
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {p0}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v1

    const v2, 0x7f0e019a

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 2183
    :cond_0
    :goto_0
    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    .line 2184
    invoke-direct {p0}, Lcom/saterskog/cell_lab/i;->b()V

    .line 2186
    :cond_1
    const/4 v0, 0x1

    if-le p1, v0, :cond_1e

    .line 2187
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-static {v0}, Lcom/saterskog/cell_lab/g;->a(Landroid/content/Context;)Ljava/util/ArrayList;

    move-result-object v0

    add-int/lit8 v1, p1, -0x2

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/saterskog/cell_lab/i;->d:Ljava/lang/String;

    .line 2188
    iget-object v0, p0, Lcom/saterskog/cell_lab/i;->d:Ljava/lang/String;

    invoke-static {v0}, Lcom/saterskog/cell_lab/g;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 8202
    :try_start_0
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/app/Activity;->openFileInput(Ljava/lang/String;)Ljava/io/FileInputStream;

    move-result-object v0

    .line 8203
    new-instance v4, Ljava/io/ObjectInputStream;

    invoke-direct {v4, v0}, Ljava/io/ObjectInputStream;-><init>(Ljava/io/InputStream;)V

    .line 8204
    invoke-virtual {v4}, Ljava/io/ObjectInputStream;->readInt()I

    move-result v2

    .line 8205
    const/16 v0, 0xbef

    if-gt v2, v0, :cond_1f

    const/16 v0, 0xbef

    if-eq v2, v0, :cond_2

    .line 8206
    const/16 v0, 0x50

    new-array v5, v0, [Lcom/saterskog/cell_lab/Gene;

    .line 8207
    const/16 v0, 0x28

    if-eq v0, v0, :cond_3

    .line 8206
    :cond_2
    const/16 v0, 0x50

    new-array v5, v0, [Lcom/saterskog/cell_lab/Gene;

    .line 8207
    const/16 v0, 0x50

    .line 8208
    :cond_3
    const/16 v1, 0x11

    if-gt v2, v1, :cond_4

    const/16 v0, 0x14

    .line 8209
    :cond_4
    const/4 v1, 0x3

    if-gt v2, v1, :cond_5

    const/16 v0, 0xf

    .line 8211
    :cond_5
    const/4 v1, 0x0

    :goto_1
    if-ge v1, v0, :cond_e

    .line 8212
    new-instance v3, Lcom/saterskog/cell_lab/Gene;

    invoke-direct {v3}, Lcom/saterskog/cell_lab/Gene;-><init>()V

    aput-object v3, v5, v1

    .line 8213
    aget-object v3, v5, v1

    invoke-virtual {v3, v4, v2}, Lcom/saterskog/cell_lab/Gene;->a(Ljava/io/ObjectInputStream;I)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 8211
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 2154
    :cond_6
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v0

    const/4 v2, 0x0

    const/16 v3, 0x8

    invoke-static {v0, v2, v3}, Lcom/saterskog/cell_lab/t;->b(Landroid/app/Activity;II)V

    .line 2155
    const/4 v0, 0x0

    :goto_2
    const/16 v2, 0x50

    if-ge v0, v2, :cond_7

    .line 2156
    iget-object v2, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    aget-object v2, v2, v0

    aget-object v3, v1, v0

    invoke-virtual {v2, v3}, Lcom/saterskog/cell_lab/Gene;->a(Lcom/saterskog/cell_lab/Gene;)V

    .line 2155
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    .line 2157
    :cond_7
    iget-object v0, p0, Lcom/saterskog/cell_lab/i;->e:Ljava/util/ArrayList;

    sget-object v1, Lcom/saterskog/cell_lab/h;->n:Lcom/saterskog/cell_lab/h;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    iget-object v0, p0, Lcom/saterskog/cell_lab/i;->e:Ljava/util/ArrayList;

    sget-object v1, Lcom/saterskog/cell_lab/h;->k:Lcom/saterskog/cell_lab/h;

    .line 2158
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    iget-object v0, p0, Lcom/saterskog/cell_lab/i;->e:Ljava/util/ArrayList;

    sget-object v1, Lcom/saterskog/cell_lab/h;->l:Lcom/saterskog/cell_lab/h;

    .line 2159
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    :cond_8
    const/4 v0, 0x1

    move v1, v0

    .line 2160
    :goto_3
    const/4 v2, 0x1

    .line 2161
    iget-object v4, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    array-length v5, v4

    const/4 v0, 0x0

    move v3, v0

    move v0, v2

    :goto_4
    if-ge v3, v5, :cond_d

    aget-object v6, v4, v3

    .line 2162
    if-nez v1, :cond_b

    .line 2163
    iget-object v7, v6, Lcom/saterskog/cell_lab/Gene;->t:[Lcom/saterskog/cell_lab/Gene$a;

    array-length v8, v7

    const/4 v2, 0x0

    :goto_5
    if-ge v2, v8, :cond_b

    aget-object v9, v7, v2

    .line 2164
    iget-short v10, v9, Lcom/saterskog/cell_lab/Gene$a;->e:S

    if-eqz v10, :cond_9

    .line 2166
    const/4 v0, 0x0

    iput-short v0, v9, Lcom/saterskog/cell_lab/Gene$a;->e:S

    .line 2167
    const/4 v0, 0x0

    .line 2163
    :cond_9
    add-int/lit8 v2, v2, 0x1

    goto :goto_5

    .line 2159
    :cond_a
    const/4 v0, 0x0

    move v1, v0

    goto :goto_3

    .line 2171
    :cond_b
    iget-object v2, p0, Lcom/saterskog/cell_lab/i;->e:Ljava/util/ArrayList;

    iget-object v7, v6, Lcom/saterskog/cell_lab/Gene;->s:Lcom/saterskog/cell_lab/h;

    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result v2

    const/4 v7, -0x1

    if-ne v2, v7, :cond_c

    .line 2172
    iget-object v0, p0, Lcom/saterskog/cell_lab/i;->e:Ljava/util/ArrayList;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/saterskog/cell_lab/h;

    iput-object v0, v6, Lcom/saterskog/cell_lab/Gene;->s:Lcom/saterskog/cell_lab/h;

    .line 2173
    const/4 v0, 0x0

    .line 2161
    :cond_c
    add-int/lit8 v2, v3, 0x1

    move v3, v2

    goto :goto_4

    .line 2176
    :cond_d
    if-nez v0, :cond_0

    .line 2177
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {p0}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v1

    const v2, 0x7f0e019e

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    goto/16 :goto_0

    .line 8215
    :cond_e
    const/4 v1, 0x0

    :goto_6
    rsub-int/lit8 v2, v0, 0x50

    if-ge v1, v2, :cond_f

    .line 8217
    add-int v2, v0, v1

    :try_start_1
    new-instance v3, Lcom/saterskog/cell_lab/Gene;

    invoke-direct {v3}, Lcom/saterskog/cell_lab/Gene;-><init>()V

    aput-object v3, v5, v2

    .line 8218
    add-int v2, v0, v1

    aget-object v2, v5, v2

    const/4 v3, 0x0

    aget-object v3, v5, v3

    invoke-virtual {v2, v3}, Lcom/saterskog/cell_lab/Gene;->a(Lcom/saterskog/cell_lab/Gene;)V

    .line 8219
    add-int v2, v0, v1

    aget-object v2, v5, v2

    const/4 v3, 0x0

    iput-boolean v3, v2, Lcom/saterskog/cell_lab/Gene;->p:Z

    .line 8215
    add-int/lit8 v1, v1, 0x1

    goto :goto_6

    .line 8221
    :cond_f
    const/4 v2, 0x1

    .line 8223
    iget-object v0, p0, Lcom/saterskog/cell_lab/i;->e:Ljava/util/ArrayList;

    sget-object v1, Lcom/saterskog/cell_lab/h;->n:Lcom/saterskog/cell_lab/h;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_10

    iget-object v0, p0, Lcom/saterskog/cell_lab/i;->e:Ljava/util/ArrayList;

    sget-object v1, Lcom/saterskog/cell_lab/h;->k:Lcom/saterskog/cell_lab/h;

    .line 8224
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_10

    iget-object v0, p0, Lcom/saterskog/cell_lab/i;->e:Ljava/util/ArrayList;

    sget-object v1, Lcom/saterskog/cell_lab/h;->l:Lcom/saterskog/cell_lab/h;

    .line 8225
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_12

    :cond_10
    const/4 v0, 0x1

    move v1, v0

    .line 8226
    :goto_7
    const/4 v0, 0x0

    move v3, v0

    :goto_8
    const/16 v0, 0x50

    if-ge v3, v0, :cond_16

    aget-object v6, v5, v3

    .line 8227
    if-nez v1, :cond_13

    .line 8228
    iget-object v7, v6, Lcom/saterskog/cell_lab/Gene;->t:[Lcom/saterskog/cell_lab/Gene$a;

    array-length v8, v7

    const/4 v0, 0x0

    move v11, v0

    move v0, v2

    move v2, v11

    :goto_9
    if-ge v2, v8, :cond_14

    aget-object v9, v7, v2

    .line 8229
    iget-short v10, v9, Lcom/saterskog/cell_lab/Gene$a;->e:S

    if-eqz v10, :cond_11

    .line 8231
    const/4 v0, 0x0

    iput-short v0, v9, Lcom/saterskog/cell_lab/Gene$a;->e:S

    .line 8232
    const/4 v0, 0x0

    .line 8228
    :cond_11
    add-int/lit8 v2, v2, 0x1

    goto :goto_9

    .line 8225
    :cond_12
    const/4 v0, 0x0

    move v1, v0

    goto :goto_7

    :cond_13
    move v0, v2

    .line 8236
    :cond_14
    iget-object v2, p0, Lcom/saterskog/cell_lab/i;->e:Ljava/util/ArrayList;

    iget-object v7, v6, Lcom/saterskog/cell_lab/Gene;->s:Lcom/saterskog/cell_lab/h;

    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result v2

    const/4 v7, -0x1

    if-ne v2, v7, :cond_15

    .line 8237
    iget-object v0, p0, Lcom/saterskog/cell_lab/i;->e:Ljava/util/ArrayList;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/saterskog/cell_lab/h;

    iput-object v0, v6, Lcom/saterskog/cell_lab/Gene;->s:Lcom/saterskog/cell_lab/h;

    .line 8238
    const/4 v0, 0x0

    .line 8226
    :cond_15
    add-int/lit8 v2, v3, 0x1

    move v3, v2

    move v2, v0

    goto :goto_8

    .line 8242
    :cond_16
    const/4 v0, 0x0

    move v1, v0

    move v0, v2

    :goto_a
    const/16 v2, 0x50

    if-ge v1, v2, :cond_18

    aget-object v2, v5, v1

    .line 8243
    iget-object v3, p0, Lcom/saterskog/cell_lab/i;->e:Ljava/util/ArrayList;

    iget-object v6, v2, Lcom/saterskog/cell_lab/Gene;->s:Lcom/saterskog/cell_lab/h;

    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result v3

    const/4 v6, -0x1

    if-ne v3, v6, :cond_17

    .line 8244
    iget-object v0, p0, Lcom/saterskog/cell_lab/i;->e:Ljava/util/ArrayList;

    const/4 v3, 0x0

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/saterskog/cell_lab/h;

    iput-object v0, v2, Lcom/saterskog/cell_lab/Gene;->s:Lcom/saterskog/cell_lab/h;

    .line 8245
    const/4 v0, 0x0

    .line 8242
    :cond_17
    add-int/lit8 v1, v1, 0x1

    goto :goto_a

    .line 8249
    :cond_18
    iput-object v5, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    .line 8251
    const/4 v1, 0x0

    .line 8252
    const/4 v2, 0x0

    :goto_b
    const/16 v3, 0x50

    if-ge v2, v3, :cond_1b

    .line 8253
    if-eqz v1, :cond_19

    iget-object v3, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    aget-object v3, v3, v2

    const/4 v5, 0x0

    iput-boolean v5, v3, Lcom/saterskog/cell_lab/Gene;->p:Z

    .line 8254
    :cond_19
    iget-object v3, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    aget-object v3, v3, v2

    iget-boolean v3, v3, Lcom/saterskog/cell_lab/Gene;->p:Z

    if-eqz v3, :cond_1a

    const/4 v1, 0x1

    .line 8252
    :cond_1a
    add-int/lit8 v2, v2, 0x1

    goto :goto_b

    .line 8256
    :cond_1b
    if-nez v1, :cond_1c

    iget-object v1, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    const/4 v2, 0x1

    iput-boolean v2, v1, Lcom/saterskog/cell_lab/Gene;->p:Z

    .line 8260
    :cond_1c
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v1

    invoke-virtual {p0}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v2

    const v3, 0x7f0e0198

    invoke-virtual {v2, v3}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    invoke-static {v1, v2, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/Toast;->show()V

    .line 8261
    if-nez v0, :cond_1d

    .line 8262
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {p0}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v1

    const v2, 0x7f0e019e

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 8263
    :cond_1d
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v0

    check-cast v0, Lcom/saterskog/cell_lab/PlayActivity;

    const/4 v1, 0x7

    invoke-virtual {v0, v1}, Lcom/saterskog/cell_lab/PlayActivity;->a(S)V

    .line 8270
    :goto_c
    invoke-virtual {v4}, Ljava/io/ObjectInputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 2191
    :cond_1e
    :goto_d
    invoke-direct {p0}, Lcom/saterskog/cell_lab/i;->d()Z

    move-result v0

    iput-boolean v0, p0, Lcom/saterskog/cell_lab/i;->h:Z

    .line 2193
    invoke-direct {p0}, Lcom/saterskog/cell_lab/i;->c()V

    .line 2194
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/i;->a()V

    .line 2195
    const/4 v0, 0x1

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Lcom/saterskog/cell_lab/i;->a(ZZ)V

    .line 2197
    const/4 v0, 0x0

    return v0

    .line 8265
    :cond_1f
    :try_start_2
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {p0}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v1

    const v2, 0x7f0e0196

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v1

    .line 8266
    invoke-virtual {v1}, Landroid/widget/Toast;->getView()Landroid/view/View;

    move-result-object v0

    const v2, 0x102000b

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 8267
    const/high16 v2, -0x10000

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 8268
    invoke-virtual {v1}, Landroid/widget/Toast;->show()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_c

    .line 8272
    :catch_0
    move-exception v0

    move-object v1, v0

    .line 8273
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v0

    const-string v2, "IOException"

    const/4 v3, 0x1

    invoke-static {v0, v2, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v2

    .line 8274
    invoke-virtual {v2}, Landroid/widget/Toast;->getView()Landroid/view/View;

    move-result-object v0

    const v3, 0x102000b

    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 8275
    const/high16 v3, -0x10000

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 8276
    invoke-virtual {v2}, Landroid/widget/Toast;->show()V

    .line 8277
    const-string v0, "hmmm, dsf"

    invoke-static {v0}, Lcom/saterskog/b/a;->a(Ljava/lang/String;)V

    .line 8278
    invoke-static {v1}, Lcom/saterskog/b/a;->a(Ljava/lang/Throwable;)V

    goto :goto_d
.end method

.method public final onAttach(Landroid/app/Activity;)V
    .locals 4

    .prologue
    .line 1370
    invoke-super {p0, p1}, Landroid/app/Fragment;->onAttach(Landroid/app/Activity;)V

    .line 1372
    :try_start_0
    move-object v0, p1

    check-cast v0, Lcom/saterskog/cell_lab/i$b;

    move-object v1, v0

    iput-object v1, p0, Lcom/saterskog/cell_lab/i;->f:Lcom/saterskog/cell_lab/i$b;
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1375
    return-void

    .line 1374
    :catch_0
    move-exception v1

    new-instance v1, Ljava/lang/ClassCastException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " must implement GenomeProvider"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/ClassCastException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 9

    .prologue
    const/4 v8, 0x3

    const/4 v7, 0x2

    const/4 v6, 0x1

    const/4 v1, 0x0

    .line 1763
    iget-boolean v0, p0, Lcom/saterskog/cell_lab/i;->j:Z

    if-eqz v0, :cond_0

    .line 1833
    :goto_0
    return-void

    .line 1764
    :cond_0
    invoke-virtual {p1}, Landroid/widget/CompoundButton;->getId()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    .line 1832
    :cond_1
    :goto_1
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/i;->a()V

    goto :goto_0

    .line 1766
    :sswitch_0
    iget-object v0, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    iget v2, p0, Lcom/saterskog/cell_lab/i;->c:I

    aget-object v0, v0, v2

    iput-boolean p2, v0, Lcom/saterskog/cell_lab/Gene;->l:Z

    .line 1767
    iget-wide v2, p0, Lcom/saterskog/cell_lab/i;->n:D

    const-wide v4, 0x3fe999999999999aL    # 0.8

    sub-double/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Math;->abs(D)D

    move-result-wide v2

    const-wide v4, 0x3faeb851eb851eb8L    # 0.06

    cmpg-double v0, v2, v4

    if-gez v0, :cond_2

    iget-object v0, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    aget-object v0, v0, v1

    iget-boolean v0, v0, Lcom/saterskog/cell_lab/Gene;->l:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    aget-object v0, v0, v1

    iget-object v0, v0, Lcom/saterskog/cell_lab/Gene;->s:Lcom/saterskog/cell_lab/h;

    sget-object v2, Lcom/saterskog/cell_lab/h;->a:Lcom/saterskog/cell_lab/h;

    if-ne v0, v2, :cond_2

    .line 1768
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-static {v0, v7, v1}, Lcom/saterskog/cell_lab/t;->b(Landroid/app/Activity;II)V

    .line 1769
    :cond_2
    iget-object v0, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    aget-object v0, v0, v1

    iget-boolean v0, v0, Lcom/saterskog/cell_lab/Gene;->l:Z

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    aget-object v0, v0, v1

    iget-object v0, v0, Lcom/saterskog/cell_lab/Gene;->s:Lcom/saterskog/cell_lab/h;

    sget-object v2, Lcom/saterskog/cell_lab/h;->n:Lcom/saterskog/cell_lab/h;

    if-ne v0, v2, :cond_3

    iget-object v0, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    aget-object v0, v0, v6

    iget-object v0, v0, Lcom/saterskog/cell_lab/Gene;->s:Lcom/saterskog/cell_lab/h;

    sget-object v2, Lcom/saterskog/cell_lab/h;->b:Lcom/saterskog/cell_lab/h;

    if-ne v0, v2, :cond_3

    iget-object v0, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    aget-object v0, v0, v7

    iget-object v0, v0, Lcom/saterskog/cell_lab/Gene;->s:Lcom/saterskog/cell_lab/h;

    sget-object v2, Lcom/saterskog/cell_lab/h;->a:Lcom/saterskog/cell_lab/h;

    if-ne v0, v2, :cond_3

    .line 1770
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-static {v0, v8, v1}, Lcom/saterskog/cell_lab/t;->b(Landroid/app/Activity;II)V

    .line 1771
    :cond_3
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v0

    const v1, 0x7f0800ae

    invoke-virtual {v0, v1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/SeekBar;

    .line 1772
    if-eqz v0, :cond_6

    .line 1773
    iget-object v1, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    iget v2, p0, Lcom/saterskog/cell_lab/i;->c:I

    aget-object v1, v1, v2

    iget-boolean v1, v1, Lcom/saterskog/cell_lab/Gene;->l:Z

    invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setEnabled(Z)V

    iget-object v1, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    iget v2, p0, Lcom/saterskog/cell_lab/i;->c:I

    aget-object v1, v1, v2

    iget-object v1, v1, Lcom/saterskog/cell_lab/Gene;->s:Lcom/saterskog/cell_lab/h;

    sget-object v2, Lcom/saterskog/cell_lab/h;->modded_cell:Lcom/saterskog/cell_lab/h;

    if-eq v1, v2, :cond_5

    iget-object v1, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    iget v2, p0, Lcom/saterskog/cell_lab/i;->c:I

    aget-object v1, v1, v2

    iget v7, v1, Lcom/saterskog/cell_lab/Gene;->i:I

    iget-object v1, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    aget-object v1, v1, v7

    iget-object v1, v1, Lcom/saterskog/cell_lab/Gene;->s:Lcom/saterskog/cell_lab/h;

    sget-object v2, Lcom/saterskog/cell_lab/h;->modded_cell:Lcom/saterskog/cell_lab/h;

    if-ne v1, v2, :cond_4

    :goto_2
    const v2, 0x0

    invoke-virtual {v0, v2}, Landroid/widget/SeekBar;->setEnabled(Z)V

    goto :goto_3

    :cond_4
    iget-object v1, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    iget v2, p0, Lcom/saterskog/cell_lab/i;->c:I

    aget-object v1, v1, v2

    iget v7, v1, Lcom/saterskog/cell_lab/Gene;->j:I

    iget-object v1, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    aget-object v1, v1, v7

    iget-object v1, v1, Lcom/saterskog/cell_lab/Gene;->s:Lcom/saterskog/cell_lab/h;

    sget-object v2, Lcom/saterskog/cell_lab/h;->modded_cell:Lcom/saterskog/cell_lab/h;

    if-ne v1, v2, :cond_6

    goto :goto_2

    :cond_5
    iget-object v1, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    iget v2, p0, Lcom/saterskog/cell_lab/i;->c:I

    aget-object v1, v1, v2

    iget v7, v1, Lcom/saterskog/cell_lab/Gene;->i:I

    iget-object v1, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    aget-object v1, v1, v7

    iget-object v1, v1, Lcom/saterskog/cell_lab/Gene;->s:Lcom/saterskog/cell_lab/h;

    sget-object v2, Lcom/saterskog/cell_lab/h;->modded_cell:Lcom/saterskog/cell_lab/h;

    if-ne v1, v2, :cond_6

    iget-object v1, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    iget v2, p0, Lcom/saterskog/cell_lab/i;->c:I

    aget-object v1, v1, v2

    iget v7, v1, Lcom/saterskog/cell_lab/Gene;->j:I

    iget-object v1, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    aget-object v1, v1, v7

    iget-object v1, v1, Lcom/saterskog/cell_lab/Gene;->s:Lcom/saterskog/cell_lab/h;

    sget-object v2, Lcom/saterskog/cell_lab/h;->modded_cell:Lcom/saterskog/cell_lab/h;

    if-ne v1, v2, :cond_6

    goto :goto_2

    .line 1774
    :cond_6
    :goto_3
    iget-object v0, p0, Lcom/saterskog/cell_lab/i;->p:Lcom/saterskog/cell_lab/i$a;

    if-eqz v0, :cond_1

    .line 1775
    iget-object v0, p0, Lcom/saterskog/cell_lab/i;->p:Lcom/saterskog/cell_lab/i$a;

    iget-object v1, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    iget v2, p0, Lcom/saterskog/cell_lab/i;->c:I

    aget-object v1, v1, v2

    iget-boolean v1, v1, Lcom/saterskog/cell_lab/Gene;->l:Z

    invoke-virtual {v0, v1}, Lcom/saterskog/cell_lab/i$a;->a(Z)V

    goto/16 :goto_1

    .line 1778
    :sswitch_1
    iget-object v0, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    iget v1, p0, Lcom/saterskog/cell_lab/i;->c:I

    aget-object v0, v0, v1

    iput-boolean p2, v0, Lcom/saterskog/cell_lab/Gene;->o:Z

    goto/16 :goto_1

    .line 1781
    :sswitch_2
    iget-object v0, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    iget v1, p0, Lcom/saterskog/cell_lab/i;->c:I

    aget-object v0, v0, v1

    iput-boolean p2, v0, Lcom/saterskog/cell_lab/Gene;->m:Z

    goto/16 :goto_1

    .line 1784
    :sswitch_3
    iget-object v0, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    iget v1, p0, Lcom/saterskog/cell_lab/i;->c:I

    aget-object v0, v0, v1

    iput-boolean p2, v0, Lcom/saterskog/cell_lab/Gene;->n:Z

    goto/16 :goto_1

    .line 1787
    :sswitch_4
    iget-object v0, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    iget v1, p0, Lcom/saterskog/cell_lab/i;->c:I

    aget-object v0, v0, v1

    iput-boolean p2, v0, Lcom/saterskog/cell_lab/Gene;->q:Z

    goto/16 :goto_1

    .line 1790
    :sswitch_5
    iget-object v0, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    iget v1, p0, Lcom/saterskog/cell_lab/i;->c:I

    aget-object v0, v0, v1

    iput-boolean p2, v0, Lcom/saterskog/cell_lab/Gene;->r:Z

    goto/16 :goto_1

    .line 1793
    :sswitch_6
    if-eqz p2, :cond_1

    move v0, v1

    .line 1794
    :goto_4
    const/16 v2, 0x50

    if-ge v0, v2, :cond_7

    iget-object v2, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    aget-object v2, v2, v0

    iput-boolean v1, v2, Lcom/saterskog/cell_lab/Gene;->p:Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_4

    .line 1795
    :cond_7
    iget-object v0, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    iget v1, p0, Lcom/saterskog/cell_lab/i;->c:I

    aget-object v0, v0, v1

    iput-boolean v6, v0, Lcom/saterskog/cell_lab/Gene;->p:Z

    .line 1796
    iget v0, p0, Lcom/saterskog/cell_lab/i;->c:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_1

    .line 1797
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-static {v0, v6, v8}, Lcom/saterskog/cell_lab/t;->b(Landroid/app/Activity;II)V

    goto/16 :goto_1

    .line 1801
    :sswitch_7
    iget-boolean v0, p0, Lcom/saterskog/cell_lab/i;->h:Z

    if-eq v0, p2, :cond_1

    .line 1802
    iput-boolean p2, p0, Lcom/saterskog/cell_lab/i;->h:Z

    .line 1826
    invoke-direct {p0}, Lcom/saterskog/cell_lab/i;->c()V

    .line 1828
    invoke-virtual {p0, v1, v1}, Lcom/saterskog/cell_lab/i;->a(ZZ)V

    goto/16 :goto_1

    nop

    .line 1764
    :sswitch_data_0
    .sparse-switch
        0x7f080025 -> :sswitch_2
        0x7f080026 -> :sswitch_3
        0x7f080027 -> :sswitch_0
        0x7f080028 -> :sswitch_4
        0x7f080029 -> :sswitch_5
        0x7f08002a -> :sswitch_7
        0x7f08002b -> :sswitch_1
        0x7f080064 -> :sswitch_6
    .end sparse-switch
.end method

.method public final onClick(Landroid/view/View;)V
    .locals 9

    .prologue
    const/4 v8, 0x0

    const/4 v0, 0x2

    const/4 v7, 0x0

    const/4 v6, 0x1

    .line 1926
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    .line 2041
    iget-object v0, p0, Lcom/saterskog/cell_lab/i;->q:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/saterskog/cell_lab/i$e;

    .line 2042
    iget-object v2, v0, Lcom/saterskog/cell_lab/i$e;->e:Landroid/widget/TextView;

    if-ne p1, v2, :cond_0

    .line 2044
    invoke-virtual {v0}, Lcom/saterskog/cell_lab/i$e;->c()Ljava/lang/String;

    move-result-object v1

    .line 8101
    iget-object v0, v0, Lcom/saterskog/cell_lab/i$e;->j:Ljava/lang/String;

    .line 2044
    invoke-direct {p0, v1, v0}, Lcom/saterskog/cell_lab/i;->a(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 2048
    :cond_1
    :goto_0
    return-void

    .line 1933
    :sswitch_0
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v1

    invoke-static {v1}, Lcom/saterskog/cell_lab/g;->a(Landroid/content/Context;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, 0x2

    new-array v3, v1, [Ljava/lang/CharSequence;

    .line 1937
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/i;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f050030

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    .line 1938
    const-string v2, "%X"

    new-array v4, v6, [Ljava/lang/Object;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v4, v7

    invoke-static {v2, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    .line 1939
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v4, "<font color=\"#"

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v4, "\">"

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p0}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v4

    const v5, 0x7f0e00dd

    invoke-virtual {v4, v5}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v4, "</font>"

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object v2

    .line 1940
    aput-object v2, v3, v7

    .line 1941
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v4, "<font color=\"#"

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\">"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const v2, 0x7f0e00a1

    invoke-virtual {p0, v2}, Lcom/saterskog/cell_lab/i;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "</font>"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object v1

    .line 1942
    aput-object v1, v3, v6

    .line 1944
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v1

    invoke-static {v1}, Lcom/saterskog/cell_lab/g;->a(Landroid/content/Context;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    move v1, v0

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 1945
    add-int/lit8 v2, v1, 0x1

    aput-object v0, v3, v1

    move v1, v2

    goto :goto_1

    .line 1947
    :cond_2
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-virtual {p0}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 1948
    const v1, 0x7f0e00d2

    invoke-virtual {p0, v1}, Lcom/saterskog/cell_lab/i;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 1953
    new-instance v1, Lcom/saterskog/cell_lab/i$5;

    invoke-direct {v1, p0}, Lcom/saterskog/cell_lab/i$5;-><init>(Lcom/saterskog/cell_lab/i;)V

    invoke-virtual {v0, v3, v1}, Landroid/app/AlertDialog$Builder;->setItems([Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 1959
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    .line 1960
    invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V

    .line 1961
    invoke-virtual {v0}, Landroid/app/AlertDialog;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const-string v2, "android:id/titleDivider"

    invoke-virtual {v1, v2, v8, v8}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v1

    .line 1962
    invoke-virtual {v0, v1}, Landroid/app/AlertDialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 1963
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/i;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f050014

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundColor(I)V

    goto/16 :goto_0

    .line 7077
    :sswitch_1
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-virtual {p0}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 7079
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v1

    const v2, 0x7f0e0069

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 7080
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v1

    const v2, 0x7f0e0068

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 7083
    new-instance v1, Landroid/widget/EditText;

    invoke-virtual {p0}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V

    .line 7084
    iget-object v2, p0, Lcom/saterskog/cell_lab/i;->d:Ljava/lang/String;

    invoke-virtual {v1, v2}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 7087
    invoke-virtual {v1, v6}, Landroid/widget/EditText;->setInputType(I)V

    .line 7089
    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    .line 7092
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v2

    const v3, 0x7f0e005f

    invoke-virtual {v2, v3}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lcom/saterskog/cell_lab/i$7;

    invoke-direct {v3, p0, v1}, Lcom/saterskog/cell_lab/i$7;-><init>(Lcom/saterskog/cell_lab/i;Landroid/widget/EditText;)V

    invoke-virtual {v0, v2, v3}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 7110
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v1

    const v2, 0x7f0e005b

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/saterskog/cell_lab/i$8;

    invoke-direct {v2, p0}, Lcom/saterskog/cell_lab/i$8;-><init>(Lcom/saterskog/cell_lab/i;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 7116
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    goto/16 :goto_0

    .line 1971
    :sswitch_2
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v0

    const v1, 0x7f0e017a

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v1

    const v2, 0x7f0e015a

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/saterskog/cell_lab/i;->a(Ljava/lang/String;Ljava/lang/CharSequence;)V

    goto/16 :goto_0

    .line 1974
    :sswitch_3
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v0

    const v1, 0x7f0e0184

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v1

    const v2, 0x7f0e0165

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/saterskog/cell_lab/i;->a(Ljava/lang/String;Ljava/lang/CharSequence;)V

    goto/16 :goto_0

    .line 1977
    :sswitch_4
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v0

    const v1, 0x7f0e0185

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v1

    const v2, 0x7f0e0166

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/saterskog/cell_lab/i;->a(Ljava/lang/String;Ljava/lang/CharSequence;)V

    goto/16 :goto_0

    .line 1981
    :sswitch_5
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v0

    const v1, 0x7f0e0181

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v1

    const v2, 0x7f0e0162

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/saterskog/cell_lab/i;->a(Ljava/lang/String;Ljava/lang/CharSequence;)V

    goto/16 :goto_0

    .line 1984
    :sswitch_6
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v0

    const v1, 0x7f0e0183

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v1

    const v2, 0x7f0e0164

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/saterskog/cell_lab/i;->a(Ljava/lang/String;Ljava/lang/CharSequence;)V

    goto/16 :goto_0

    .line 1987
    :sswitch_7
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v0

    const v1, 0x7f0e0186

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v1

    const v2, 0x7f0e0167

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/saterskog/cell_lab/i;->a(Ljava/lang/String;Ljava/lang/CharSequence;)V

    goto/16 :goto_0

    .line 1990
    :sswitch_8
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v0

    const v1, 0x7f0e0187

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v1

    const v2, 0x7f0e0168

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/saterskog/cell_lab/i;->a(Ljava/lang/String;Ljava/lang/CharSequence;)V

    goto/16 :goto_0

    .line 1993
    :sswitch_9
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v0

    const v1, 0x7f0e018f

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v1

    const v2, 0x7f0e0173

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/saterskog/cell_lab/i;->a(Ljava/lang/String;Ljava/lang/CharSequence;)V

    goto/16 :goto_0

    .line 1996
    :sswitch_a
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v0

    const v1, 0x7f0e017c

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v1

    const v2, 0x7f0e015c

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/saterskog/cell_lab/i;->a(Ljava/lang/String;Ljava/lang/CharSequence;)V

    goto/16 :goto_0

    .line 1999
    :sswitch_b
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v0

    const v1, 0x7f0e018d

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v1

    const v2, 0x7f0e0171

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/saterskog/cell_lab/i;->a(Ljava/lang/String;Ljava/lang/CharSequence;)V

    goto/16 :goto_0

    .line 2002
    :sswitch_c
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v0

    const v1, 0x7f0e018e

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v1

    const v2, 0x7f0e0172

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/saterskog/cell_lab/i;->a(Ljava/lang/String;Ljava/lang/CharSequence;)V

    goto/16 :goto_0

    .line 2005
    :sswitch_d
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v0

    const v1, 0x7f0e0188

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v1

    const v2, 0x7f0e016c

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/saterskog/cell_lab/i;->a(Ljava/lang/String;Ljava/lang/CharSequence;)V

    goto/16 :goto_0

    .line 2008
    :sswitch_e
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v0

    const v1, 0x7f0e0190

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v1

    const v2, 0x7f0e0178

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/saterskog/cell_lab/i;->a(Ljava/lang/String;Ljava/lang/CharSequence;)V

    goto/16 :goto_0

    .line 2011
    :sswitch_f
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v0

    const v1, 0x7f0e018b

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v1

    const v2, 0x7f0e016f

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/saterskog/cell_lab/i;->a(Ljava/lang/String;Ljava/lang/CharSequence;)V

    goto/16 :goto_0

    .line 2014
    :sswitch_10
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v0

    const v1, 0x7f0e018c

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v1

    const v2, 0x7f0e0170

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/saterskog/cell_lab/i;->a(Ljava/lang/String;Ljava/lang/CharSequence;)V

    goto/16 :goto_0

    .line 2017
    :sswitch_11
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v0

    const v1, 0x7f0e017d

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v1

    const v2, 0x7f0e015d

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/saterskog/cell_lab/i;->a(Ljava/lang/String;Ljava/lang/CharSequence;)V

    goto/16 :goto_0

    .line 2020
    :sswitch_12
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v0

    const v1, 0x7f0e017f

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v1

    const v2, 0x7f0e015f

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/saterskog/cell_lab/i;->a(Ljava/lang/String;Ljava/lang/CharSequence;)V

    goto/16 :goto_0

    .line 2024
    :sswitch_13
    iput-boolean v6, p0, Lcom/saterskog/cell_lab/i;->g:Z

    .line 2025
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v0

    const v1, 0x7f0e0189

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v1

    const v2, 0x7f0e016d

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/saterskog/cell_lab/i;->a(Ljava/lang/String;Ljava/lang/CharSequence;)V

    goto/16 :goto_0

    .line 2028
    :sswitch_14
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v0

    const v1, 0x7f0e0182

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v1

    const v2, 0x7f0e0163

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/saterskog/cell_lab/i;->a(Ljava/lang/String;Ljava/lang/CharSequence;)V

    goto/16 :goto_0

    .line 2031
    :sswitch_15
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v0

    const v1, 0x7f0e017b

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v1

    const v2, 0x7f0e015b

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/saterskog/cell_lab/i;->a(Ljava/lang/String;Ljava/lang/CharSequence;)V

    goto/16 :goto_0

    .line 2035
    :sswitch_16
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v0

    const v1, 0x7f0e017e

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v1

    const v2, 0x7f0e015e

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/saterskog/cell_lab/i;->a(Ljava/lang/String;Ljava/lang/CharSequence;)V

    goto/16 :goto_0

    .line 2038
    :sswitch_17
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v0

    const v1, 0x7f0e0180

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v1

    const v2, 0x7f0e0160

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/saterskog/cell_lab/i;->a(Ljava/lang/String;Ljava/lang/CharSequence;)V

    goto/16 :goto_0

    .line 1926
    nop

    :sswitch_data_0
    .sparse-switch
        0x7f080017 -> :sswitch_0
        0x7f08001b -> :sswitch_1
        0x7f08009d -> :sswitch_15
        0x7f08009f -> :sswitch_11
        0x7f0800a1 -> :sswitch_12
        0x7f0800a3 -> :sswitch_14
        0x7f0800a5 -> :sswitch_b
        0x7f0800a8 -> :sswitch_d
        0x7f0800ab -> :sswitch_13
        0x7f0800ad -> :sswitch_10
        0x7f0800af -> :sswitch_e
        0x7f0800c1 -> :sswitch_16
        0x7f0800c3 -> :sswitch_17
        0x7f0800d4 -> :sswitch_5
        0x7f0800d6 -> :sswitch_6
        0x7f0800d7 -> :sswitch_3
        0x7f0800d8 -> :sswitch_4
        0x7f0800d9 -> :sswitch_2
        0x7f0800da -> :sswitch_7
        0x7f0800db -> :sswitch_8
        0x7f0800e2 -> :sswitch_c
        0x7f0800e3 -> :sswitch_f
        0x7f0800e4 -> :sswitch_9
        0x7f0800ea -> :sswitch_a
    .end sparse-switch
.end method

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 7

    .prologue
    const/16 v1, 0x18

    const/4 v2, 0x0

    .line 905
    invoke-super {p0, p1}, Landroid/app/Fragment;->onCreate(Landroid/os/Bundle;)V

    .line 906
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-static {v0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 907
    const-string v3, "show_gene_type"

    invoke-interface {v0, v3, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/saterskog/cell_lab/i;->k:Z

    .line 910
    const-string v0, ""

    iput-object v0, p0, Lcom/saterskog/cell_lab/i;->d:Ljava/lang/String;

    .line 911
    if-nez p1, :cond_0

    .line 912
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/saterskog/cell_lab/i;->h:Z

    .line 913
    iput v1, p0, Lcom/saterskog/cell_lab/i;->l:I

    .line 914
    const/16 v0, 0x50

    new-array v0, v0, [Lcom/saterskog/cell_lab/Gene;

    iput-object v0, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    .line 915
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/saterskog/cell_lab/i;->n:D

    .line 916
    invoke-direct {p0}, Lcom/saterskog/cell_lab/i;->b()V

    .line 928
    :goto_0
    return-void

    .line 918
    :cond_0
    const-string v0, "gi"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/saterskog/cell_lab/i;->c:I

    .line 919
    const-string v0, "mGenes"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelableArray(Ljava/lang/String;)[Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, [Lcom/saterskog/cell_lab/Gene;

    check-cast v0, [Lcom/saterskog/cell_lab/Gene;

    iput-object v0, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    .line 920
    const-string v0, "mTime"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getDouble(Ljava/lang/String;)D

    move-result-wide v4

    iput-wide v4, p0, Lcom/saterskog/cell_lab/i;->n:D

    .line 921
    const-string v0, "genePool"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getIntArray(Ljava/lang/String;)[I

    move-result-object v3

    .line 922
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/saterskog/cell_lab/i;->e:Ljava/util/ArrayList;

    .line 923
    array-length v4, v3

    move v0, v2

    :goto_1
    if-ge v0, v4, :cond_1

    aget v2, v3, v0

    iget-object v5, p0, Lcom/saterskog/cell_lab/i;->e:Ljava/util/ArrayList;

    sget-object v6, Lcom/saterskog/cell_lab/h;->B:[Lcom/saterskog/cell_lab/h;

    aget-object v2, v6, v2

    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 924
    :cond_1
    const-string v0, "snapAngles"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/saterskog/cell_lab/i;->h:Z

    .line 925
    iget-boolean v0, p0, Lcom/saterskog/cell_lab/i;->h:Z

    if-eqz v0, :cond_2

    move v0, v1

    :goto_2
    iput v0, p0, Lcom/saterskog/cell_lab/i;->l:I

    goto :goto_0

    :cond_2
    const/16 v0, 0x4b0

    goto :goto_2
.end method

.method public final onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 26

    .prologue
    .line 1111
    const v2, 0x7f0a0020

    const/4 v3, 0x0

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    invoke-virtual {v0, v2, v1, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v2

    move-object/from16 v0, p0

    iput-object v2, v0, Lcom/saterskog/cell_lab/i;->o:Landroid/view/View;

    .line 1113
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/saterskog/cell_lab/i;->o:Landroid/view/View;

    const v3, 0x7f080042

    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    move-object/from16 v25, v2

    check-cast v25, Landroid/widget/LinearLayout;

    .line 1123
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/saterskog/cell_lab/i;->q:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 1124
    move-object/from16 v0, p0

    iget-object v8, v0, Lcom/saterskog/cell_lab/i;->q:Ljava/util/ArrayList;

    new-instance v2, Lcom/saterskog/cell_lab/i$a;

    const v3, 0x7f0e00ac

    move-object/from16 v0, p0

    invoke-virtual {v0, v3}, Lcom/saterskog/cell_lab/i;->getString(I)Ljava/lang/String;

    move-result-object v4

    const v3, 0x7f0e00ad

    move-object/from16 v0, p0

    invoke-virtual {v0, v3}, Lcom/saterskog/cell_lab/i;->getString(I)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x6

    const/4 v7, 0x0

    move-object/from16 v3, p0

    invoke-direct/range {v2 .. v7}, Lcom/saterskog/cell_lab/i$a;-><init>(Lcom/saterskog/cell_lab/i;Ljava/lang/String;Ljava/lang/String;ILcom/saterskog/cell_lab/h;)V

    invoke-virtual {v8, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1125
    new-instance v2, Lcom/saterskog/cell_lab/i$a;

    const v3, 0x7f0e00a2

    move-object/from16 v0, p0

    invoke-virtual {v0, v3}, Lcom/saterskog/cell_lab/i;->getString(I)Ljava/lang/String;

    move-result-object v4

    const v3, 0x7f0e00a3

    move-object/from16 v0, p0

    invoke-virtual {v0, v3}, Lcom/saterskog/cell_lab/i;->getString(I)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x5

    const/4 v7, 0x0

    move-object/from16 v3, p0

    invoke-direct/range {v2 .. v7}, Lcom/saterskog/cell_lab/i$a;-><init>(Lcom/saterskog/cell_lab/i;Ljava/lang/String;Ljava/lang/String;ILcom/saterskog/cell_lab/h;)V

    move-object/from16 v0, p0

    iput-object v2, v0, Lcom/saterskog/cell_lab/i;->p:Lcom/saterskog/cell_lab/i$a;

    .line 1126
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/saterskog/cell_lab/i;->p:Lcom/saterskog/cell_lab/i$a;

    const/high16 v3, 0x42c80000    # 100.0f

    iput v3, v2, Lcom/saterskog/cell_lab/i$a;->b:F

    .line 1127
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/saterskog/cell_lab/i;->q:Ljava/util/ArrayList;

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/saterskog/cell_lab/i;->p:Lcom/saterskog/cell_lab/i$a;

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v0, p0

    iget-object v8, v0, Lcom/saterskog/cell_lab/i;->q:Ljava/util/ArrayList;

    new-instance v2, Lcom/saterskog/cell_lab/i$a;

    const-string v4, "Cell size"

    const-string v5, "The maximum diameter this cell is allowed to grow to in micrometers."

    const/4 v6, 0x7

    const/4 v7, 0x0

    move-object/from16 v3, p0

    invoke-direct/range {v2 .. v7}, Lcom/saterskog/cell_lab/i$a;-><init>(Lcom/saterskog/cell_lab/i;Ljava/lang/String;Ljava/lang/String;ILcom/saterskog/cell_lab/h;)V

    invoke-virtual {v8, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1129
    sget-object v2, Lcom/saterskog/cell_lab/Gene;->w:[I

    const/16 v3, 0x9

    aget v2, v2, v3

    new-array v8, v2, [Ljava/lang/String;

    .line 1130
    const/4 v2, 0x0

    :goto_0
    sget-object v3, Lcom/saterskog/cell_lab/Gene;->w:[I

    const/16 v4, 0x9

    aget v3, v3, v4

    if-ge v2, v3, :cond_0

    .line 1131
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    add-int/lit8 v4, v2, 0x1

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v8, v2

    .line 1130
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 1132
    :cond_0
    move-object/from16 v0, p0

    iget-object v11, v0, Lcom/saterskog/cell_lab/i;->q:Ljava/util/ArrayList;

    new-instance v2, Lcom/saterskog/cell_lab/i$c;

    const v3, 0x7f0e00af

    move-object/from16 v0, p0

    invoke-virtual {v0, v3}, Lcom/saterskog/cell_lab/i;->getString(I)Ljava/lang/String;

    move-result-object v4

    const v3, 0x7f0e00b0

    move-object/from16 v0, p0

    invoke-virtual {v0, v3}, Lcom/saterskog/cell_lab/i;->getString(I)Ljava/lang/String;

    move-result-object v5

    const/16 v6, 0x9

    const/4 v7, 0x0

    const/4 v9, 0x1

    const/4 v10, 0x0

    move-object/from16 v3, p0

    invoke-direct/range {v2 .. v10}, Lcom/saterskog/cell_lab/i$c;-><init>(Lcom/saterskog/cell_lab/i;Ljava/lang/String;Ljava/lang/String;ILcom/saterskog/cell_lab/h;[Ljava/lang/String;IZ)V

    invoke-virtual {v11, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/16 v2, 0x15

    new-array v1, v2, [Ljava/lang/String;

    const/16 v0, 0x0

    const-string v5, "0"

    aput-object v5, v1, v0

    const/16 v0, 0x15

    const/16 v2, 0x1

    :goto_1
    if-ge v2, v0, :cond_1

    invoke-static {v2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    move-object/from16 v0, p0

    iget-object v11, v0, Lcom/saterskog/cell_lab/i;->q:Ljava/util/ArrayList;

    move-object/from16 v8, v1

    new-instance v2, Lcom/saterskog/cell_lab/i$c;

    const/16 v6, 0xc

    const-string v4, "Min connections"

    const-string v5, "Minimum amount of adhesin connections this cell must have before splitting."

    const/4 v9, -0x1

    const/4 v7, 0x0

    const/4 v10, 0x0

    move-object/from16 v3, p0

    invoke-direct/range {v2 .. v10}, Lcom/saterskog/cell_lab/i$c;-><init>(Lcom/saterskog/cell_lab/i;Ljava/lang/String;Ljava/lang/String;ILcom/saterskog/cell_lab/h;[Ljava/lang/String;IZ)V

    invoke-virtual {v11, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/16 v2, 0x15

    new-array v1, v2, [Ljava/lang/String;

    const/16 v0, 0x14

    const/4 v2, 0x0

    const/4 v9, 0x1

    :goto_2
    if-ge v2, v0, :cond_2

    invoke-static {v9}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v1, v2

    add-int/lit8 v2, v2, 0x1

    add-int/lit8 v9, v2, 0x1

    goto :goto_2

    :cond_2
    const-string v9, "\u221e"

    aput-object v9, v1, v0

    move-object/from16 v0, p0

    iget-object v11, v0, Lcom/saterskog/cell_lab/i;->q:Ljava/util/ArrayList;

    move-object/from16 v8, v1

    new-instance v2, Lcom/saterskog/cell_lab/i$c;

    const/16 v6, 0xb

    const-string v4, "Max splits"

    const-string v5, "Maximum amount of times the cell can split before being unable to anymore. The split count is only inherited by child 1. Child 2 begins with a fresh split count."

    const/16 v6, 0xb

    const/4 v9, -0x1

    const/4 v7, 0x0

    const/4 v10, 0x0

    move-object/from16 v3, p0

    invoke-direct/range {v2 .. v10}, Lcom/saterskog/cell_lab/i$c;-><init>(Lcom/saterskog/cell_lab/i;Ljava/lang/String;Ljava/lang/String;ILcom/saterskog/cell_lab/h;[Ljava/lang/String;IZ)V

    invoke-virtual {v11, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1134
    const/16 v2, 0x50

    new-array v8, v2, [Ljava/lang/String;

    .line 1135
    const/4 v2, 0x0

    :goto_3
    const/16 v3, 0x50

    if-ge v2, v3, :cond_3

    .line 1136
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const v4, 0x7f0e00b5

    move-object/from16 v0, p0

    invoke-virtual {v0, v4}, Lcom/saterskog/cell_lab/i;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    add-int/lit8 v4, v2, 0x1

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v8, v2

    .line 1135
    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    .line 1137
    :cond_3
    new-instance v2, Lcom/saterskog/cell_lab/i$c;

    const-string v4, "Mode after splits"

    const-string v5, "Sets which mode child 1 will turn into once it has reached it\'s maximum split amount."

    const/16 v6, 0xd

    const/4 v9, -0x1

    const/4 v7, 0x0

    const/4 v10, 0x1

    move-object/from16 v3, p0

    invoke-direct/range {v2 .. v10}, Lcom/saterskog/cell_lab/i$c;-><init>(Lcom/saterskog/cell_lab/i;Ljava/lang/String;Ljava/lang/String;ILcom/saterskog/cell_lab/h;[Ljava/lang/String;IZ)V

    invoke-virtual {v11, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v2, Lcom/saterskog/cell_lab/Gene;->B:[I

    array-length v2, v2

    new-array v15, v2, [Ljava/lang/String;

    .line 1138
    const/4 v2, 0x0

    const-string v3, "\u221e"

    aput-object v3, v15, v2

    .line 1139
    const/4 v2, 0x1

    :goto_4
    sget-object v3, Lcom/saterskog/cell_lab/Gene;->B:[I

    array-length v3, v3

    if-ge v2, v3, :cond_4

    .line 1140
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v4, Lcom/saterskog/cell_lab/Gene;->B:[I

    aget v4, v4, v2

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v15, v2

    .line 1139
    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    .line 1142
    :cond_4
    move-object/from16 v0, p0

    iget-object v11, v0, Lcom/saterskog/cell_lab/i;->q:Ljava/util/ArrayList;

    new-instance v2, Lcom/saterskog/cell_lab/i$c;

    invoke-virtual/range {p0 .. p0}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v3

    const v4, 0x7f0e00d0

    invoke-virtual {v3, v4}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v4

    const v3, 0x7f0e0192

    move-object/from16 v0, p0

    invoke-virtual {v0, v3}, Lcom/saterskog/cell_lab/i;->getString(I)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    sget-object v7, Lcom/saterskog/cell_lab/h;->i:Lcom/saterskog/cell_lab/h;

    const/4 v9, -0x1

    const/4 v10, 0x1

    move-object/from16 v3, p0

    invoke-direct/range {v2 .. v10}, Lcom/saterskog/cell_lab/i$c;-><init>(Lcom/saterskog/cell_lab/i;Ljava/lang/String;Ljava/lang/String;ILcom/saterskog/cell_lab/h;[Ljava/lang/String;IZ)V

    invoke-virtual {v11, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1144
    move-object/from16 v0, p0

    iget-object v9, v0, Lcom/saterskog/cell_lab/i;->q:Ljava/util/ArrayList;

    new-instance v2, Lcom/saterskog/cell_lab/i$f;

    const v3, 0x7f0e00cf

    move-object/from16 v0, p0

    invoke-virtual {v0, v3}, Lcom/saterskog/cell_lab/i;->getString(I)Ljava/lang/String;

    move-result-object v4

    const v3, 0x7f0e0179

    move-object/from16 v0, p0

    invoke-virtual {v0, v3}, Lcom/saterskog/cell_lab/i;->getString(I)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    sget-object v7, Lcom/saterskog/cell_lab/h;->b:Lcom/saterskog/cell_lab/h;

    move-object/from16 v3, p0

    invoke-direct/range {v2 .. v7}, Lcom/saterskog/cell_lab/i$f;-><init>(Lcom/saterskog/cell_lab/i;Ljava/lang/String;Ljava/lang/String;ILcom/saterskog/cell_lab/h;)V

    invoke-virtual {v9, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1145
    move-object/from16 v0, p0

    iget-object v9, v0, Lcom/saterskog/cell_lab/i;->q:Ljava/util/ArrayList;

    new-instance v2, Lcom/saterskog/cell_lab/i$f;

    const v3, 0x7f0e00bf

    move-object/from16 v0, p0

    invoke-virtual {v0, v3}, Lcom/saterskog/cell_lab/i;->getString(I)Ljava/lang/String;

    move-result-object v4

    const v3, 0x7f0e0161

    move-object/from16 v0, p0

    invoke-virtual {v0, v3}, Lcom/saterskog/cell_lab/i;->getString(I)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x1

    sget-object v7, Lcom/saterskog/cell_lab/h;->g:Lcom/saterskog/cell_lab/h;

    move-object/from16 v3, p0

    invoke-direct/range {v2 .. v7}, Lcom/saterskog/cell_lab/i$f;-><init>(Lcom/saterskog/cell_lab/i;Ljava/lang/String;Ljava/lang/String;ILcom/saterskog/cell_lab/h;)V

    invoke-virtual {v9, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1146
    move-object/from16 v0, p0

    iget-object v9, v0, Lcom/saterskog/cell_lab/i;->q:Ljava/util/ArrayList;

    new-instance v2, Lcom/saterskog/cell_lab/i$f;

    const v3, 0x7f0e00e2

    move-object/from16 v0, p0

    invoke-virtual {v0, v3}, Lcom/saterskog/cell_lab/i;->getString(I)Ljava/lang/String;

    move-result-object v4

    const v3, 0x7f0e016a

    move-object/from16 v0, p0

    invoke-virtual {v0, v3}, Lcom/saterskog/cell_lab/i;->getString(I)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x3

    sget-object v7, Lcom/saterskog/cell_lab/h;->m:Lcom/saterskog/cell_lab/h;

    move-object/from16 v3, p0

    invoke-direct/range {v2 .. v7}, Lcom/saterskog/cell_lab/i$f;-><init>(Lcom/saterskog/cell_lab/i;Ljava/lang/String;Ljava/lang/String;ILcom/saterskog/cell_lab/h;)V

    invoke-virtual {v9, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1147
    move-object/from16 v0, p0

    iget-object v9, v0, Lcom/saterskog/cell_lab/i;->q:Ljava/util/ArrayList;

    new-instance v2, Lcom/saterskog/cell_lab/i$f;

    const v3, 0x7f0e00e1

    move-object/from16 v0, p0

    invoke-virtual {v0, v3}, Lcom/saterskog/cell_lab/i;->getString(I)Ljava/lang/String;

    move-result-object v4

    const v3, 0x7f0e0169

    move-object/from16 v0, p0

    invoke-virtual {v0, v3}, Lcom/saterskog/cell_lab/i;->getString(I)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x2

    sget-object v7, Lcom/saterskog/cell_lab/h;->m:Lcom/saterskog/cell_lab/h;

    move-object/from16 v3, p0

    invoke-direct/range {v2 .. v7}, Lcom/saterskog/cell_lab/i$f;-><init>(Lcom/saterskog/cell_lab/i;Ljava/lang/String;Ljava/lang/String;ILcom/saterskog/cell_lab/h;)V

    invoke-virtual {v9, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1148
    move-object/from16 v0, p0

    iget-object v9, v0, Lcom/saterskog/cell_lab/i;->q:Ljava/util/ArrayList;

    new-instance v2, Lcom/saterskog/cell_lab/i$f;

    const v3, 0x7f0e00e3

    move-object/from16 v0, p0

    invoke-virtual {v0, v3}, Lcom/saterskog/cell_lab/i;->getString(I)Ljava/lang/String;

    move-result-object v4

    const v3, 0x7f0e016b

    move-object/from16 v0, p0

    invoke-virtual {v0, v3}, Lcom/saterskog/cell_lab/i;->getString(I)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x4

    sget-object v7, Lcom/saterskog/cell_lab/h;->m:Lcom/saterskog/cell_lab/h;

    move-object/from16 v3, p0

    invoke-direct/range {v2 .. v7}, Lcom/saterskog/cell_lab/i$f;-><init>(Lcom/saterskog/cell_lab/i;Ljava/lang/String;Ljava/lang/String;ILcom/saterskog/cell_lab/h;)V

    invoke-virtual {v9, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1149
    move-object/from16 v0, p0

    iget-object v11, v0, Lcom/saterskog/cell_lab/i;->q:Ljava/util/ArrayList;

    new-instance v2, Lcom/saterskog/cell_lab/i$c;

    const v3, 0x7f0e0138

    move-object/from16 v0, p0

    invoke-virtual {v0, v3}, Lcom/saterskog/cell_lab/i;->getString(I)Ljava/lang/String;

    move-result-object v4

    const v3, 0x7f0e0174

    move-object/from16 v0, p0

    invoke-virtual {v0, v3}, Lcom/saterskog/cell_lab/i;->getString(I)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    sget-object v7, Lcom/saterskog/cell_lab/h;->p:Lcom/saterskog/cell_lab/h;

    const/4 v9, -0x1

    const/4 v10, 0x1

    move-object/from16 v3, p0

    invoke-direct/range {v2 .. v10}, Lcom/saterskog/cell_lab/i$c;-><init>(Lcom/saterskog/cell_lab/i;Ljava/lang/String;Ljava/lang/String;ILcom/saterskog/cell_lab/h;[Ljava/lang/String;IZ)V

    invoke-virtual {v11, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1150
    move-object/from16 v0, p0

    iget-object v9, v0, Lcom/saterskog/cell_lab/i;->q:Ljava/util/ArrayList;

    new-instance v2, Lcom/saterskog/cell_lab/i$f;

    const v3, 0x7f0e013a

    move-object/from16 v0, p0

    invoke-virtual {v0, v3}, Lcom/saterskog/cell_lab/i;->getString(I)Ljava/lang/String;

    move-result-object v4

    const v3, 0x7f0e0176

    move-object/from16 v0, p0

    invoke-virtual {v0, v3}, Lcom/saterskog/cell_lab/i;->getString(I)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x5

    sget-object v7, Lcom/saterskog/cell_lab/h;->p:Lcom/saterskog/cell_lab/h;

    move-object/from16 v3, p0

    invoke-direct/range {v2 .. v7}, Lcom/saterskog/cell_lab/i$f;-><init>(Lcom/saterskog/cell_lab/i;Ljava/lang/String;Ljava/lang/String;ILcom/saterskog/cell_lab/h;)V

    invoke-virtual {v9, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1151
    move-object/from16 v0, p0

    iget-object v11, v0, Lcom/saterskog/cell_lab/i;->q:Ljava/util/ArrayList;

    new-instance v2, Lcom/saterskog/cell_lab/i$c;

    const v3, 0x7f0e0139

    move-object/from16 v0, p0

    invoke-virtual {v0, v3}, Lcom/saterskog/cell_lab/i;->getString(I)Ljava/lang/String;

    move-result-object v4

    const v3, 0x7f0e0175

    move-object/from16 v0, p0

    invoke-virtual {v0, v3}, Lcom/saterskog/cell_lab/i;->getString(I)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x1

    sget-object v7, Lcom/saterskog/cell_lab/h;->p:Lcom/saterskog/cell_lab/h;

    const/4 v9, -0x1

    const/4 v10, 0x1

    move-object/from16 v3, p0

    invoke-direct/range {v2 .. v10}, Lcom/saterskog/cell_lab/i$c;-><init>(Lcom/saterskog/cell_lab/i;Ljava/lang/String;Ljava/lang/String;ILcom/saterskog/cell_lab/h;[Ljava/lang/String;IZ)V

    invoke-virtual {v11, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1152
    move-object/from16 v0, p0

    iget-object v9, v0, Lcom/saterskog/cell_lab/i;->q:Ljava/util/ArrayList;

    new-instance v2, Lcom/saterskog/cell_lab/i$f;

    const v3, 0x7f0e013b

    move-object/from16 v0, p0

    invoke-virtual {v0, v3}, Lcom/saterskog/cell_lab/i;->getString(I)Ljava/lang/String;

    move-result-object v4

    const v3, 0x7f0e0177

    move-object/from16 v0, p0

    invoke-virtual {v0, v3}, Lcom/saterskog/cell_lab/i;->getString(I)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x6

    sget-object v7, Lcom/saterskog/cell_lab/h;->p:Lcom/saterskog/cell_lab/h;

    move-object/from16 v3, p0

    invoke-direct/range {v2 .. v7}, Lcom/saterskog/cell_lab/i$f;-><init>(Lcom/saterskog/cell_lab/i;Ljava/lang/String;Ljava/lang/String;ILcom/saterskog/cell_lab/h;)V

    invoke-virtual {v9, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1153
    move-object/from16 v0, p0

    iget-object v11, v0, Lcom/saterskog/cell_lab/i;->q:Ljava/util/ArrayList;

    new-instance v2, Lcom/saterskog/cell_lab/i$c;

    const v3, 0x7f0e00a8

    move-object/from16 v0, p0

    invoke-virtual {v0, v3}, Lcom/saterskog/cell_lab/i;->getString(I)Ljava/lang/String;

    move-result-object v4

    const v3, 0x7f0e00a9

    move-object/from16 v0, p0

    invoke-virtual {v0, v3}, Lcom/saterskog/cell_lab/i;->getString(I)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x1

    sget-object v7, Lcom/saterskog/cell_lab/h;->q:Lcom/saterskog/cell_lab/h;

    const/4 v9, -0x1

    const/4 v10, 0x1

    move-object/from16 v3, p0

    invoke-direct/range {v2 .. v10}, Lcom/saterskog/cell_lab/i$c;-><init>(Lcom/saterskog/cell_lab/i;Ljava/lang/String;Ljava/lang/String;ILcom/saterskog/cell_lab/h;[Ljava/lang/String;IZ)V

    invoke-virtual {v11, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1154
    move-object/from16 v0, p0

    iget-object v11, v0, Lcom/saterskog/cell_lab/i;->q:Ljava/util/ArrayList;

    new-instance v2, Lcom/saterskog/cell_lab/i$c;

    const v3, 0x7f0e00b1

    move-object/from16 v0, p0

    invoke-virtual {v0, v3}, Lcom/saterskog/cell_lab/i;->getString(I)Ljava/lang/String;

    move-result-object v4

    const v3, 0x7f0e00b2

    move-object/from16 v0, p0

    invoke-virtual {v0, v3}, Lcom/saterskog/cell_lab/i;->getString(I)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    sget-object v7, Lcom/saterskog/cell_lab/h;->q:Lcom/saterskog/cell_lab/h;

    const/4 v9, -0x1

    const/4 v10, 0x1

    move-object/from16 v3, p0

    invoke-direct/range {v2 .. v10}, Lcom/saterskog/cell_lab/i$c;-><init>(Lcom/saterskog/cell_lab/i;Ljava/lang/String;Ljava/lang/String;ILcom/saterskog/cell_lab/h;[Ljava/lang/String;IZ)V

    invoke-virtual {v11, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1155
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/saterskog/cell_lab/i;->q:Ljava/util/ArrayList;

    new-instance v9, Lcom/saterskog/cell_lab/i$c;

    const v3, 0x7f0e00b3

    move-object/from16 v0, p0

    invoke-virtual {v0, v3}, Lcom/saterskog/cell_lab/i;->getString(I)Ljava/lang/String;

    move-result-object v11

    const v3, 0x7f0e00b4

    move-object/from16 v0, p0

    invoke-virtual {v0, v3}, Lcom/saterskog/cell_lab/i;->getString(I)Ljava/lang/String;

    move-result-object v12

    const/16 v13, 0xa

    sget-object v14, Lcom/saterskog/cell_lab/h;->q:Lcom/saterskog/cell_lab/h;

    const/16 v16, -0x1

    const/16 v17, 0x0

    move-object/from16 v10, p0

    invoke-direct/range {v9 .. v17}, Lcom/saterskog/cell_lab/i$c;-><init>(Lcom/saterskog/cell_lab/i;Ljava/lang/String;Ljava/lang/String;ILcom/saterskog/cell_lab/h;[Ljava/lang/String;IZ)V

    invoke-virtual {v2, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1156
    move-object/from16 v0, p0

    iget-object v9, v0, Lcom/saterskog/cell_lab/i;->q:Ljava/util/ArrayList;

    new-instance v2, Lcom/saterskog/cell_lab/i$f;

    const v3, 0x7f0e00a4

    move-object/from16 v0, p0

    invoke-virtual {v0, v3}, Lcom/saterskog/cell_lab/i;->getString(I)Ljava/lang/String;

    move-result-object v4

    const v3, 0x7f0e00a5

    move-object/from16 v0, p0

    invoke-virtual {v0, v3}, Lcom/saterskog/cell_lab/i;->getString(I)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x2

    sget-object v7, Lcom/saterskog/cell_lab/h;->r:Lcom/saterskog/cell_lab/h;

    move-object/from16 v3, p0

    invoke-direct/range {v2 .. v7}, Lcom/saterskog/cell_lab/i$f;-><init>(Lcom/saterskog/cell_lab/i;Ljava/lang/String;Ljava/lang/String;ILcom/saterskog/cell_lab/h;)V

    invoke-virtual {v9, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1157
    move-object/from16 v0, p0

    iget-object v9, v0, Lcom/saterskog/cell_lab/i;->q:Ljava/util/ArrayList;

    new-instance v2, Lcom/saterskog/cell_lab/i$f;

    const v3, 0x7f0e00a6

    move-object/from16 v0, p0

    invoke-virtual {v0, v3}, Lcom/saterskog/cell_lab/i;->getString(I)Ljava/lang/String;

    move-result-object v4

    const v3, 0x7f0e00a7

    move-object/from16 v0, p0

    invoke-virtual {v0, v3}, Lcom/saterskog/cell_lab/i;->getString(I)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x4

    sget-object v7, Lcom/saterskog/cell_lab/h;->r:Lcom/saterskog/cell_lab/h;

    move-object/from16 v3, p0

    invoke-direct/range {v2 .. v7}, Lcom/saterskog/cell_lab/i$f;-><init>(Lcom/saterskog/cell_lab/i;Ljava/lang/String;Ljava/lang/String;ILcom/saterskog/cell_lab/h;)V

    invoke-virtual {v9, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1159
    sget-object v2, Lcom/saterskog/cell_lab/Gene;->w:[I

    const/4 v3, 0x4

    aget v2, v2, v3

    new-array v15, v2, [Ljava/lang/String;

    .line 1160
    const/4 v2, 0x0

    const v3, 0x7f0e010e

    move-object/from16 v0, p0

    invoke-virtual {v0, v3}, Lcom/saterskog/cell_lab/i;->getString(I)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v15, v2

    .line 1161
    const/4 v2, 0x1

    const v3, 0x7f0e010d

    move-object/from16 v0, p0

    invoke-virtual {v0, v3}, Lcom/saterskog/cell_lab/i;->getString(I)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v15, v2

    .line 1162
    const/4 v2, 0x2

    const v3, 0x7f0e0111

    move-object/from16 v0, p0

    invoke-virtual {v0, v3}, Lcom/saterskog/cell_lab/i;->getString(I)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v15, v2

    .line 1163
    const/4 v2, 0x3

    const v3, 0x7f0e0110

    move-object/from16 v0, p0

    invoke-virtual {v0, v3}, Lcom/saterskog/cell_lab/i;->getString(I)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v15, v2

    .line 1164
    const/4 v2, 0x5

    const v3, 0x7f0e010f

    move-object/from16 v0, p0

    invoke-virtual {v0, v3}, Lcom/saterskog/cell_lab/i;->getString(I)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v15, v2

    .line 1165
    const/4 v2, 0x6

    const v3, 0x7f0e0112

    move-object/from16 v0, p0

    invoke-virtual {v0, v3}, Lcom/saterskog/cell_lab/i;->getString(I)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v15, v2

    .line 1166
    const/4 v2, 0x4

    const v3, 0x7f0e010c

    move-object/from16 v0, p0

    invoke-virtual {v0, v3}, Lcom/saterskog/cell_lab/i;->getString(I)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v15, v2

    .line 1167
    const/4 v2, 0x0

    :goto_5
    const/16 v3, 0x10

    if-ge v2, v3, :cond_5

    .line 1168
    add-int/lit8 v3, v2, 0x7

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "-"

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const v5, 0x7f0e0123

    move-object/from16 v0, p0

    invoke-virtual {v0, v5}, Lcom/saterskog/cell_lab/i;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    add-int/lit8 v5, v2, 0x1

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v15, v3

    .line 1167
    add-int/lit8 v2, v2, 0x1

    goto :goto_5

    .line 1169
    :cond_5
    const/4 v2, 0x0

    :goto_6
    const/16 v3, 0x10

    if-ge v2, v3, :cond_6

    .line 1170
    add-int/lit8 v3, v2, 0x17

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "+"

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const v5, 0x7f0e0123

    move-object/from16 v0, p0

    invoke-virtual {v0, v5}, Lcom/saterskog/cell_lab/i;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    add-int/lit8 v5, v2, 0x1

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v15, v3

    .line 1169
    add-int/lit8 v2, v2, 0x1

    goto :goto_6

    .line 1171
    :cond_6
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/saterskog/cell_lab/i;->q:Ljava/util/ArrayList;

    new-instance v9, Lcom/saterskog/cell_lab/i$c;

    const v3, 0x7f0e00c9

    move-object/from16 v0, p0

    invoke-virtual {v0, v3}, Lcom/saterskog/cell_lab/i;->getString(I)Ljava/lang/String;

    move-result-object v11

    const v3, 0x7f0e016e

    move-object/from16 v0, p0

    invoke-virtual {v0, v3}, Lcom/saterskog/cell_lab/i;->getString(I)Ljava/lang/String;

    move-result-object v12

    const/4 v13, 0x4

    sget-object v14, Lcom/saterskog/cell_lab/h;->o:Lcom/saterskog/cell_lab/h;

    const/16 v16, -0x1

    const/16 v17, 0x0

    move-object/from16 v10, p0

    invoke-direct/range {v9 .. v17}, Lcom/saterskog/cell_lab/i$c;-><init>(Lcom/saterskog/cell_lab/i;Ljava/lang/String;Ljava/lang/String;ILcom/saterskog/cell_lab/h;[Ljava/lang/String;IZ)V

    invoke-virtual {v2, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1173
    const/16 v2, 0x10

    new-array v0, v2, [Ljava/lang/String;

    move-object/from16 v22, v0

    .line 1174
    const/4 v2, 0x0

    :goto_7
    const/16 v3, 0x10

    if-ge v2, v3, :cond_7

    .line 1175
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const v4, 0x7f0e0123

    move-object/from16 v0, p0

    invoke-virtual {v0, v4}, Lcom/saterskog/cell_lab/i;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    add-int/lit8 v4, v2, 0x1

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v22, v2

    .line 1174
    add-int/lit8 v2, v2, 0x1

    goto :goto_7

    .line 1177
    :cond_7
    const/4 v2, 0x6

    new-array v15, v2, [Ljava/lang/String;

    .line 1178
    const/4 v2, 0x0

    const v3, 0x7f0e0132

    move-object/from16 v0, p0

    invoke-virtual {v0, v3}, Lcom/saterskog/cell_lab/i;->getString(I)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v15, v2

    .line 1179
    const/4 v2, 0x1

    const v3, 0x7f0e0133

    move-object/from16 v0, p0

    invoke-virtual {v0, v3}, Lcom/saterskog/cell_lab/i;->getString(I)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v15, v2

    .line 1180
    const/4 v2, 0x2

    const v3, 0x7f0e0135

    move-object/from16 v0, p0

    invoke-virtual {v0, v3}, Lcom/saterskog/cell_lab/i;->getString(I)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v15, v2

    .line 1181
    const/4 v2, 0x3

    const v3, 0x7f0e0134

    move-object/from16 v0, p0

    invoke-virtual {v0, v3}, Lcom/saterskog/cell_lab/i;->getString(I)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v15, v2

    .line 1182
    const/4 v2, 0x4

    const v3, 0x7f0e0136

    move-object/from16 v0, p0

    invoke-virtual {v0, v3}, Lcom/saterskog/cell_lab/i;->getString(I)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v15, v2

    .line 1183
    const/4 v2, 0x5

    const v3, 0x7f0e0137

    move-object/from16 v0, p0

    invoke-virtual {v0, v3}, Lcom/saterskog/cell_lab/i;->getString(I)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v15, v2

    .line 1185
    const/4 v2, 0x0

    :goto_8
    const/4 v3, 0x2

    if-ge v2, v3, :cond_9

    .line 1187
    if-nez v2, :cond_8

    .line 1188
    sget-object v14, Lcom/saterskog/cell_lab/h;->l:Lcom/saterskog/cell_lab/h;

    .line 1192
    :goto_9
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/saterskog/cell_lab/i;->q:Ljava/util/ArrayList;

    new-instance v9, Lcom/saterskog/cell_lab/i$c;

    const v4, 0x7f0e009f

    move-object/from16 v0, p0

    invoke-virtual {v0, v4}, Lcom/saterskog/cell_lab/i;->getString(I)Ljava/lang/String;

    move-result-object v11

    const v4, 0x7f0e00a0

    move-object/from16 v0, p0

    invoke-virtual {v0, v4}, Lcom/saterskog/cell_lab/i;->getString(I)Ljava/lang/String;

    move-result-object v12

    const/4 v13, 0x3

    const/16 v16, -0x1

    const/16 v17, 0x0

    move-object/from16 v10, p0

    invoke-direct/range {v9 .. v17}, Lcom/saterskog/cell_lab/i$c;-><init>(Lcom/saterskog/cell_lab/i;Ljava/lang/String;Ljava/lang/String;ILcom/saterskog/cell_lab/h;[Ljava/lang/String;IZ)V

    invoke-virtual {v3, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1193
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/saterskog/cell_lab/i;->q:Ljava/util/ArrayList;

    new-instance v16, Lcom/saterskog/cell_lab/i$c;

    const v4, 0x7f0e0094

    move-object/from16 v0, p0

    invoke-virtual {v0, v4}, Lcom/saterskog/cell_lab/i;->getString(I)Ljava/lang/String;

    move-result-object v18

    const v4, 0x7f0e009a

    move-object/from16 v0, p0

    invoke-virtual {v0, v4}, Lcom/saterskog/cell_lab/i;->getString(I)Ljava/lang/String;

    move-result-object v19

    const/16 v20, 0x2

    const/16 v23, -0x1

    const/16 v24, 0x0

    move-object/from16 v17, p0

    move-object/from16 v21, v14

    invoke-direct/range {v16 .. v24}, Lcom/saterskog/cell_lab/i$c;-><init>(Lcom/saterskog/cell_lab/i;Ljava/lang/String;Ljava/lang/String;ILcom/saterskog/cell_lab/h;[Ljava/lang/String;IZ)V

    move-object/from16 v0, v16

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1194
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/saterskog/cell_lab/i;->q:Ljava/util/ArrayList;

    new-instance v9, Lcom/saterskog/cell_lab/i$a;

    const v4, 0x7f0e0093

    move-object/from16 v0, p0

    invoke-virtual {v0, v4}, Lcom/saterskog/cell_lab/i;->getString(I)Ljava/lang/String;

    move-result-object v11

    const v4, 0x7f0e0099

    move-object/from16 v0, p0

    invoke-virtual {v0, v4}, Lcom/saterskog/cell_lab/i;->getString(I)Ljava/lang/String;

    move-result-object v12

    const/4 v13, 0x0

    move-object/from16 v10, p0

    invoke-direct/range {v9 .. v14}, Lcom/saterskog/cell_lab/i$a;-><init>(Lcom/saterskog/cell_lab/i;Ljava/lang/String;Ljava/lang/String;ILcom/saterskog/cell_lab/h;)V

    invoke-virtual {v3, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1195
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/saterskog/cell_lab/i;->q:Ljava/util/ArrayList;

    new-instance v9, Lcom/saterskog/cell_lab/i$a;

    const v4, 0x7f0e009b

    move-object/from16 v0, p0

    invoke-virtual {v0, v4}, Lcom/saterskog/cell_lab/i;->getString(I)Ljava/lang/String;

    move-result-object v11

    const v4, 0x7f0e009c

    move-object/from16 v0, p0

    invoke-virtual {v0, v4}, Lcom/saterskog/cell_lab/i;->getString(I)Ljava/lang/String;

    move-result-object v12

    const/4 v13, 0x1

    move-object/from16 v10, p0

    invoke-direct/range {v9 .. v14}, Lcom/saterskog/cell_lab/i$a;-><init>(Lcom/saterskog/cell_lab/i;Ljava/lang/String;Ljava/lang/String;ILcom/saterskog/cell_lab/h;)V

    invoke-virtual {v3, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1196
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/saterskog/cell_lab/i;->q:Ljava/util/ArrayList;

    new-instance v9, Lcom/saterskog/cell_lab/i$a;

    const v4, 0x7f0e0097

    move-object/from16 v0, p0

    invoke-virtual {v0, v4}, Lcom/saterskog/cell_lab/i;->getString(I)Ljava/lang/String;

    move-result-object v11

    const v4, 0x7f0e0098

    move-object/from16 v0, p0

    invoke-virtual {v0, v4}, Lcom/saterskog/cell_lab/i;->getString(I)Ljava/lang/String;

    move-result-object v12

    const/4 v13, 0x2

    move-object/from16 v10, p0

    invoke-direct/range {v9 .. v14}, Lcom/saterskog/cell_lab/i$a;-><init>(Lcom/saterskog/cell_lab/i;Ljava/lang/String;Ljava/lang/String;ILcom/saterskog/cell_lab/h;)V

    invoke-virtual {v3, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1197
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/saterskog/cell_lab/i;->q:Ljava/util/ArrayList;

    new-instance v9, Lcom/saterskog/cell_lab/i$a;

    const v4, 0x7f0e0095

    move-object/from16 v0, p0

    invoke-virtual {v0, v4}, Lcom/saterskog/cell_lab/i;->getString(I)Ljava/lang/String;

    move-result-object v11

    const v4, 0x7f0e0096

    move-object/from16 v0, p0

    invoke-virtual {v0, v4}, Lcom/saterskog/cell_lab/i;->getString(I)Ljava/lang/String;

    move-result-object v12

    const/4 v13, 0x3

    move-object/from16 v10, p0

    invoke-direct/range {v9 .. v14}, Lcom/saterskog/cell_lab/i$a;-><init>(Lcom/saterskog/cell_lab/i;Ljava/lang/String;Ljava/lang/String;ILcom/saterskog/cell_lab/h;)V

    invoke-virtual {v3, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1198
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/saterskog/cell_lab/i;->q:Ljava/util/ArrayList;

    new-instance v9, Lcom/saterskog/cell_lab/i$a;

    const v4, 0x7f0e009d

    move-object/from16 v0, p0

    invoke-virtual {v0, v4}, Lcom/saterskog/cell_lab/i;->getString(I)Ljava/lang/String;

    move-result-object v11

    const v4, 0x7f0e009e

    move-object/from16 v0, p0

    invoke-virtual {v0, v4}, Lcom/saterskog/cell_lab/i;->getString(I)Ljava/lang/String;

    move-result-object v12

    const/4 v13, 0x4

    move-object/from16 v10, p0

    invoke-direct/range {v9 .. v14}, Lcom/saterskog/cell_lab/i$a;-><init>(Lcom/saterskog/cell_lab/i;Ljava/lang/String;Ljava/lang/String;ILcom/saterskog/cell_lab/h;)V

    invoke-virtual {v3, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1185
    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_8

    .line 1190
    :cond_8
    sget-object v14, Lcom/saterskog/cell_lab/h;->k:Lcom/saterskog/cell_lab/h;

    goto/16 :goto_9

    .line 1204
    :cond_9
    const/4 v2, 0x0

    move v9, v2

    :goto_a
    const/4 v2, 0x4

    if-ge v9, v2, :cond_a

    .line 1205
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/saterskog/cell_lab/i;->q:Ljava/util/ArrayList;

    new-instance v16, Lcom/saterskog/cell_lab/i$c;

    const v3, 0x7f0e0094

    move-object/from16 v0, p0

    invoke-virtual {v0, v3}, Lcom/saterskog/cell_lab/i;->getString(I)Ljava/lang/String;

    move-result-object v18

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const v4, 0x7f0e0090

    move-object/from16 v0, p0

    invoke-virtual {v0, v4}, Lcom/saterskog/cell_lab/i;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    add-int/lit8 v4, v9, 0x1

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const v4, 0x7f0e0091

    move-object/from16 v0, p0

    invoke-virtual {v0, v4}, Lcom/saterskog/cell_lab/i;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v19

    add-int/lit8 v20, v9, 0x5

    sget-object v21, Lcom/saterskog/cell_lab/h;->n:Lcom/saterskog/cell_lab/h;

    const/16 v23, -0x1

    const/16 v24, 0x0

    move-object/from16 v17, p0

    invoke-direct/range {v16 .. v24}, Lcom/saterskog/cell_lab/i$c;-><init>(Lcom/saterskog/cell_lab/i;Ljava/lang/String;Ljava/lang/String;ILcom/saterskog/cell_lab/h;[Ljava/lang/String;IZ)V

    move-object/from16 v0, v16

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1206
    move-object/from16 v0, p0

    iget-object v10, v0, Lcom/saterskog/cell_lab/i;->q:Ljava/util/ArrayList;

    new-instance v2, Lcom/saterskog/cell_lab/i$f;

    const v3, 0x7f0e0093

    move-object/from16 v0, p0

    invoke-virtual {v0, v3}, Lcom/saterskog/cell_lab/i;->getString(I)Ljava/lang/String;

    move-result-object v4

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const v5, 0x7f0e008e

    move-object/from16 v0, p0

    invoke-virtual {v0, v5}, Lcom/saterskog/cell_lab/i;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    add-int/lit8 v5, v9, 0x1

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const v5, 0x7f0e008f

    move-object/from16 v0, p0

    invoke-virtual {v0, v5}, Lcom/saterskog/cell_lab/i;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    add-int/lit8 v6, v9, 0x7

    sget-object v7, Lcom/saterskog/cell_lab/h;->n:Lcom/saterskog/cell_lab/h;

    move-object/from16 v3, p0

    invoke-direct/range {v2 .. v7}, Lcom/saterskog/cell_lab/i$f;-><init>(Lcom/saterskog/cell_lab/i;Ljava/lang/String;Ljava/lang/String;ILcom/saterskog/cell_lab/h;)V

    invoke-virtual {v10, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1204
    add-int/lit8 v2, v9, 0x1

    move v9, v2

    goto/16 :goto_a

    .line 1208
    :cond_a
    const/4 v2, 0x0

    move v3, v2

    :goto_b
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/saterskog/cell_lab/i;->q:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v3, v2, :cond_c

    .line 1209
    invoke-virtual/range {p0 .. p0}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v4

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/saterskog/cell_lab/i;->q:Ljava/util/ArrayList;

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/saterskog/cell_lab/i$e;

    iget v2, v2, Lcom/saterskog/cell_lab/i$e;->k:I

    invoke-static {v4, v2}, Lcom/saterskog/cell_lab/j;->a(Landroid/content/Context;I)Z

    move-result v2

    if-nez v2, :cond_b

    .line 1211
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/saterskog/cell_lab/i;->q:Ljava/util/ArrayList;

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 1212
    add-int/lit8 v3, v3, -0x1

    .line 1208
    :cond_b
    add-int/lit8 v2, v3, 0x1

    move v3, v2

    goto :goto_b

    .line 1215
    :cond_c
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/saterskog/cell_lab/i;->q:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_d
    :goto_c
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_e

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/saterskog/cell_lab/i$e;

    .line 1216
    iget-object v4, v2, Lcom/saterskog/cell_lab/i$e;->g:Lcom/saterskog/cell_lab/h;

    if-nez v4, :cond_d

    .line 1217
    invoke-virtual {v2}, Lcom/saterskog/cell_lab/i$e;->a()Landroid/view/View;

    move-result-object v2

    move-object/from16 v0, v25

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    goto :goto_c

    .line 1220
    :cond_e
    new-instance v2, Landroid/view/View;

    invoke-virtual/range {p0 .. p0}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v3

    invoke-direct {v2, v3}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 1221
    move-object/from16 v0, v25

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 1222
    invoke-virtual/range {p0 .. p0}, Lcom/saterskog/cell_lab/i;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f050014

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getColor(I)I

    move-result v3

    invoke-virtual {v2, v3}, Landroid/view/View;->setBackgroundColor(I)V

    .line 1223
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    const/4 v4, -0x1

    iput v4, v3, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 1224
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v4

    iget v4, v4, Landroid/util/DisplayMetrics;->density:F

    mul-float/2addr v3, v4

    float-to-int v3, v3

    iput v3, v2, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 1227
    new-instance v2, Landroid/widget/Button;

    invoke-virtual/range {p0 .. p0}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v3

    invoke-direct {v2, v3}, Landroid/widget/Button;-><init>(Landroid/content/Context;)V

    move-object/from16 v0, p0

    iput-object v2, v0, Lcom/saterskog/cell_lab/i;->b:Landroid/widget/Button;

    .line 1228
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/saterskog/cell_lab/i;->b:Landroid/widget/Button;

    const v3, 0x7f0e0092

    invoke-virtual {v2, v3}, Landroid/widget/Button;->setText(I)V

    .line 1229
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/saterskog/cell_lab/i;->b:Landroid/widget/Button;

    new-instance v3, Lcom/saterskog/cell_lab/i$3;

    move-object/from16 v0, p0

    invoke-direct {v3, v0}, Lcom/saterskog/cell_lab/i$3;-><init>(Lcom/saterskog/cell_lab/i;)V

    invoke-virtual {v2, v3}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1237
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/saterskog/cell_lab/i;->b:Landroid/widget/Button;

    move-object/from16 v0, v25

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 1239
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/saterskog/cell_lab/i;->q:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_f
    :goto_d
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_10

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/saterskog/cell_lab/i$e;

    .line 1240
    iget-object v4, v2, Lcom/saterskog/cell_lab/i$e;->g:Lcom/saterskog/cell_lab/h;

    if-eqz v4, :cond_f

    .line 1241
    invoke-virtual {v2}, Lcom/saterskog/cell_lab/i$e;->a()Landroid/view/View;

    move-result-object v2

    move-object/from16 v0, v25

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    goto :goto_d

    .line 1244
    :cond_10
    move-object/from16 v0, p0

    iget-boolean v2, v0, Lcom/saterskog/cell_lab/i;->h:Z

    if-eqz v2, :cond_11

    .line 1245
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/saterskog/cell_lab/i;->o:Landroid/view/View;

    const v3, 0x7f0800ac

    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/SeekBar;

    const/16 v3, 0x18

    invoke-virtual {v2, v3}, Landroid/widget/SeekBar;->setMax(I)V

    .line 1246
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/saterskog/cell_lab/i;->o:Landroid/view/View;

    const v3, 0x7f08009e

    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/SeekBar;

    const/16 v3, 0x18

    invoke-virtual {v2, v3}, Landroid/widget/SeekBar;->setMax(I)V

    .line 1247
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/saterskog/cell_lab/i;->o:Landroid/view/View;

    const v3, 0x7f0800a0

    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/SeekBar;

    const/16 v3, 0x18

    invoke-virtual {v2, v3}, Landroid/widget/SeekBar;->setMax(I)V

    .line 1248
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/saterskog/cell_lab/i;->o:Landroid/view/View;

    const v3, 0x7f0800a4

    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/SeekBar;

    const/16 v3, 0x18

    invoke-virtual {v2, v3}, Landroid/widget/SeekBar;->setMax(I)V

    .line 1249
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/saterskog/cell_lab/i;->o:Landroid/view/View;

    const v3, 0x7f0800a7

    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/SeekBar;

    const/16 v3, 0x18

    invoke-virtual {v2, v3}, Landroid/widget/SeekBar;->setMax(I)V

    .line 1250
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/saterskog/cell_lab/i;->o:Landroid/view/View;

    const v3, 0x7f0800a9

    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/SeekBar;

    const/16 v3, 0x18

    invoke-virtual {v2, v3}, Landroid/widget/SeekBar;->setMax(I)V

    .line 1251
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/saterskog/cell_lab/i;->o:Landroid/view/View;

    const v3, 0x7f0800ae

    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/SeekBar;

    const/16 v3, 0x18

    invoke-virtual {v2, v3}, Landroid/widget/SeekBar;->setMax(I)V

    .line 1252
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/saterskog/cell_lab/i;->o:Landroid/view/View;

    const v3, 0x7f0800aa

    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/SeekBar;

    const/16 v3, 0x18

    invoke-virtual {v2, v3}, Landroid/widget/SeekBar;->setMax(I)V

    .line 1253
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/saterskog/cell_lab/i;->o:Landroid/view/View;

    const v3, 0x7f08009c

    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/SeekBar;

    const/16 v3, 0x18

    invoke-virtual {v2, v3}, Landroid/widget/SeekBar;->setMax(I)V

    .line 1254
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/saterskog/cell_lab/i;->o:Landroid/view/View;

    const v3, 0x7f0800a2

    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/SeekBar;

    const/16 v3, 0x18

    invoke-virtual {v2, v3}, Landroid/widget/SeekBar;->setMax(I)V

    .line 1265
    :cond_11
    const/4 v2, 0x1

    move-object/from16 v0, p0

    invoke-direct {v0, v2, v8}, Lcom/saterskog/cell_lab/i;->a(Z[Ljava/lang/String;)Landroid/widget/ArrayAdapter;

    move-result-object v3

    .line 1266
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/saterskog/cell_lab/i;->o:Landroid/view/View;

    const v4, 0x7f0800bf

    invoke-virtual {v2, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/Spinner;

    invoke-virtual {v2, v3}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    .line 1267
    const/4 v2, 0x0

    move-object/from16 v0, p0

    invoke-direct {v0, v2, v8}, Lcom/saterskog/cell_lab/i;->a(Z[Ljava/lang/String;)Landroid/widget/ArrayAdapter;

    move-result-object v3

    .line 1269
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/saterskog/cell_lab/i;->o:Landroid/view/View;

    const v4, 0x7f0800c0

    invoke-virtual {v2, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/Spinner;

    invoke-virtual {v2, v3}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    .line 1270
    const/4 v2, 0x0

    move-object/from16 v0, p0

    invoke-direct {v0, v2, v8}, Lcom/saterskog/cell_lab/i;->a(Z[Ljava/lang/String;)Landroid/widget/ArrayAdapter;

    move-result-object v3

    .line 1272
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/saterskog/cell_lab/i;->o:Landroid/view/View;

    const v4, 0x7f0800c2

    invoke-virtual {v2, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/Spinner;

    invoke-virtual {v2, v3}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    .line 1274
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 1275
    const/4 v2, 0x0

    move v3, v2

    :goto_e
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/saterskog/cell_lab/i;->e:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v3, v2, :cond_12

    .line 1276
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/saterskog/cell_lab/i;->e:Ljava/util/ArrayList;

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/saterskog/cell_lab/h;

    invoke-virtual/range {p0 .. p0}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v5

    invoke-virtual {v2, v5}, Lcom/saterskog/cell_lab/h;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/saterskog/b/e;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1275
    add-int/lit8 v2, v3, 0x1

    move v3, v2

    goto :goto_e

    .line 1278
    :cond_12
    new-instance v3, Landroid/widget/ArrayAdapter;

    invoke-virtual/range {p0 .. p0}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v2

    const v5, 0x7f0a0028

    invoke-direct {v3, v2, v5, v4}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;ILjava/util/List;)V

    .line 1279
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/saterskog/cell_lab/i;->o:Landroid/view/View;

    const v4, 0x7f0800c6

    invoke-virtual {v2, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/Spinner;

    invoke-virtual {v2, v3}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    .line 1281
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/saterskog/cell_lab/i;->o:Landroid/view/View;

    const/high16 v3, 0x7f080000

    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Lcom/saterskog/cell_lab/GenomePreviewView;

    move-object/from16 v0, p0

    iput-object v2, v0, Lcom/saterskog/cell_lab/i;->m:Lcom/saterskog/cell_lab/GenomePreviewView;

    .line 1282
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/saterskog/cell_lab/i;->m:Lcom/saterskog/cell_lab/GenomePreviewView;

    move-object/from16 v0, p0

    invoke-virtual {v2, v0}, Lcom/saterskog/cell_lab/GenomePreviewView;->setCallback(Lcom/saterskog/cell_lab/c;)V

    .line 1283
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/saterskog/cell_lab/i;->o:Landroid/view/View;

    const v3, 0x7f0800c6

    move-object/from16 v0, p0

    invoke-direct {v0, v2, v3}, Lcom/saterskog/cell_lab/i;->a(Landroid/view/View;I)V

    .line 1284
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/saterskog/cell_lab/i;->o:Landroid/view/View;

    const v3, 0x7f0800bf

    move-object/from16 v0, p0

    invoke-direct {v0, v2, v3}, Lcom/saterskog/cell_lab/i;->a(Landroid/view/View;I)V

    .line 1290
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/saterskog/cell_lab/i;->o:Landroid/view/View;

    const v3, 0x7f0800c0

    move-object/from16 v0, p0

    invoke-direct {v0, v2, v3}, Lcom/saterskog/cell_lab/i;->a(Landroid/view/View;I)V

    .line 1291
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/saterskog/cell_lab/i;->o:Landroid/view/View;

    const v3, 0x7f0800c2

    move-object/from16 v0, p0

    invoke-direct {v0, v2, v3}, Lcom/saterskog/cell_lab/i;->a(Landroid/view/View;I)V

    .line 1292
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/saterskog/cell_lab/i;->o:Landroid/view/View;

    const v3, 0x7f0800b0

    move-object/from16 v0, p0

    invoke-direct {v0, v2, v3}, Lcom/saterskog/cell_lab/i;->d(Landroid/view/View;I)V

    .line 1293
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/saterskog/cell_lab/i;->o:Landroid/view/View;

    const v3, 0x7f0800aa

    move-object/from16 v0, p0

    invoke-direct {v0, v2, v3}, Lcom/saterskog/cell_lab/i;->d(Landroid/view/View;I)V

    .line 1294
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/saterskog/cell_lab/i;->o:Landroid/view/View;

    const v3, 0x7f0800a2

    move-object/from16 v0, p0

    invoke-direct {v0, v2, v3}, Lcom/saterskog/cell_lab/i;->d(Landroid/view/View;I)V

    .line 1295
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/saterskog/cell_lab/i;->o:Landroid/view/View;

    const v3, 0x7f08009c

    move-object/from16 v0, p0

    invoke-direct {v0, v2, v3}, Lcom/saterskog/cell_lab/i;->d(Landroid/view/View;I)V

    .line 1296
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/saterskog/cell_lab/i;->o:Landroid/view/View;

    const v3, 0x7f08009e

    move-object/from16 v0, p0

    invoke-direct {v0, v2, v3}, Lcom/saterskog/cell_lab/i;->d(Landroid/view/View;I)V

    .line 1297
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/saterskog/cell_lab/i;->o:Landroid/view/View;

    const v3, 0x7f0800a0

    move-object/from16 v0, p0

    invoke-direct {v0, v2, v3}, Lcom/saterskog/cell_lab/i;->d(Landroid/view/View;I)V

    .line 1298
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/saterskog/cell_lab/i;->o:Landroid/view/View;

    const v3, 0x7f0800a4

    move-object/from16 v0, p0

    invoke-direct {v0, v2, v3}, Lcom/saterskog/cell_lab/i;->d(Landroid/view/View;I)V

    .line 1299
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/saterskog/cell_lab/i;->o:Landroid/view/View;

    const v3, 0x7f0800a7

    move-object/from16 v0, p0

    invoke-direct {v0, v2, v3}, Lcom/saterskog/cell_lab/i;->d(Landroid/view/View;I)V

    .line 1300
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/saterskog/cell_lab/i;->o:Landroid/view/View;

    const v3, 0x7f0800a9

    move-object/from16 v0, p0

    invoke-direct {v0, v2, v3}, Lcom/saterskog/cell_lab/i;->d(Landroid/view/View;I)V

    .line 1301
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/saterskog/cell_lab/i;->o:Landroid/view/View;

    const v3, 0x7f0800ac

    move-object/from16 v0, p0

    invoke-direct {v0, v2, v3}, Lcom/saterskog/cell_lab/i;->d(Landroid/view/View;I)V

    .line 1302
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/saterskog/cell_lab/i;->o:Landroid/view/View;

    const v3, 0x7f0800ae

    move-object/from16 v0, p0

    invoke-direct {v0, v2, v3}, Lcom/saterskog/cell_lab/i;->d(Landroid/view/View;I)V

    .line 1303
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/saterskog/cell_lab/i;->o:Landroid/view/View;

    const v3, 0x7f080027

    move-object/from16 v0, p0

    invoke-direct {v0, v2, v3}, Lcom/saterskog/cell_lab/i;->e(Landroid/view/View;I)V

    .line 1304
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/saterskog/cell_lab/i;->o:Landroid/view/View;

    const v3, 0x7f08002b

    move-object/from16 v0, p0

    invoke-direct {v0, v2, v3}, Lcom/saterskog/cell_lab/i;->e(Landroid/view/View;I)V

    .line 1305
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/saterskog/cell_lab/i;->o:Landroid/view/View;

    const v3, 0x7f080025

    move-object/from16 v0, p0

    invoke-direct {v0, v2, v3}, Lcom/saterskog/cell_lab/i;->e(Landroid/view/View;I)V

    .line 1306
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/saterskog/cell_lab/i;->o:Landroid/view/View;

    const v3, 0x7f080026

    move-object/from16 v0, p0

    invoke-direct {v0, v2, v3}, Lcom/saterskog/cell_lab/i;->e(Landroid/view/View;I)V

    .line 1307
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/saterskog/cell_lab/i;->o:Landroid/view/View;

    const v3, 0x7f080028

    move-object/from16 v0, p0

    invoke-direct {v0, v2, v3}, Lcom/saterskog/cell_lab/i;->e(Landroid/view/View;I)V

    .line 1308
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/saterskog/cell_lab/i;->o:Landroid/view/View;

    const v3, 0x7f080029

    move-object/from16 v0, p0

    invoke-direct {v0, v2, v3}, Lcom/saterskog/cell_lab/i;->e(Landroid/view/View;I)V

    .line 1309
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/saterskog/cell_lab/i;->o:Landroid/view/View;

    const v3, 0x7f08002a

    move-object/from16 v0, p0

    invoke-direct {v0, v2, v3}, Lcom/saterskog/cell_lab/i;->e(Landroid/view/View;I)V

    .line 1311
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/saterskog/cell_lab/i;->o:Landroid/view/View;

    const v3, 0x7f080017

    move-object/from16 v0, p0

    invoke-direct {v0, v2, v3}, Lcom/saterskog/cell_lab/i;->b(Landroid/view/View;I)V

    .line 1312
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/saterskog/cell_lab/i;->o:Landroid/view/View;

    const v3, 0x7f08001b

    move-object/from16 v0, p0

    invoke-direct {v0, v2, v3}, Lcom/saterskog/cell_lab/i;->b(Landroid/view/View;I)V

    .line 1314
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/saterskog/cell_lab/i;->o:Landroid/view/View;

    .line 5417
    const v3, 0x7f080064

    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/RadioButton;

    move-object/from16 v0, p0

    invoke-virtual {v2, v0}, Landroid/widget/RadioButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 1316
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/saterskog/cell_lab/i;->o:Landroid/view/View;

    const v3, 0x7f0800d4

    move-object/from16 v0, p0

    invoke-direct {v0, v2, v3}, Lcom/saterskog/cell_lab/i;->c(Landroid/view/View;I)V

    .line 1317
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/saterskog/cell_lab/i;->o:Landroid/view/View;

    const v3, 0x7f0800d9

    move-object/from16 v0, p0

    invoke-direct {v0, v2, v3}, Lcom/saterskog/cell_lab/i;->c(Landroid/view/View;I)V

    .line 1318
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/saterskog/cell_lab/i;->o:Landroid/view/View;

    const v3, 0x7f0800d7

    move-object/from16 v0, p0

    invoke-direct {v0, v2, v3}, Lcom/saterskog/cell_lab/i;->c(Landroid/view/View;I)V

    .line 1319
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/saterskog/cell_lab/i;->o:Landroid/view/View;

    const v3, 0x7f0800d8

    move-object/from16 v0, p0

    invoke-direct {v0, v2, v3}, Lcom/saterskog/cell_lab/i;->c(Landroid/view/View;I)V

    .line 1320
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/saterskog/cell_lab/i;->o:Landroid/view/View;

    const v3, 0x7f0800d6

    move-object/from16 v0, p0

    invoke-direct {v0, v2, v3}, Lcom/saterskog/cell_lab/i;->c(Landroid/view/View;I)V

    .line 1321
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/saterskog/cell_lab/i;->o:Landroid/view/View;

    const v3, 0x7f0800da

    move-object/from16 v0, p0

    invoke-direct {v0, v2, v3}, Lcom/saterskog/cell_lab/i;->c(Landroid/view/View;I)V

    .line 1322
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/saterskog/cell_lab/i;->o:Landroid/view/View;

    const v3, 0x7f0800db

    move-object/from16 v0, p0

    invoke-direct {v0, v2, v3}, Lcom/saterskog/cell_lab/i;->c(Landroid/view/View;I)V

    .line 1323
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/saterskog/cell_lab/i;->o:Landroid/view/View;

    const v3, 0x7f0800e4

    move-object/from16 v0, p0

    invoke-direct {v0, v2, v3}, Lcom/saterskog/cell_lab/i;->c(Landroid/view/View;I)V

    .line 1324
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/saterskog/cell_lab/i;->o:Landroid/view/View;

    const v3, 0x7f0800ea

    move-object/from16 v0, p0

    invoke-direct {v0, v2, v3}, Lcom/saterskog/cell_lab/i;->c(Landroid/view/View;I)V

    .line 1325
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/saterskog/cell_lab/i;->o:Landroid/view/View;

    const v3, 0x7f0800a5

    move-object/from16 v0, p0

    invoke-direct {v0, v2, v3}, Lcom/saterskog/cell_lab/i;->c(Landroid/view/View;I)V

    .line 1326
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/saterskog/cell_lab/i;->o:Landroid/view/View;

    const v3, 0x7f0800e2

    move-object/from16 v0, p0

    invoke-direct {v0, v2, v3}, Lcom/saterskog/cell_lab/i;->c(Landroid/view/View;I)V

    .line 1327
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/saterskog/cell_lab/i;->o:Landroid/view/View;

    const v3, 0x7f0800a8

    move-object/from16 v0, p0

    invoke-direct {v0, v2, v3}, Lcom/saterskog/cell_lab/i;->c(Landroid/view/View;I)V

    .line 1328
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/saterskog/cell_lab/i;->o:Landroid/view/View;

    const v3, 0x7f0800af

    move-object/from16 v0, p0

    invoke-direct {v0, v2, v3}, Lcom/saterskog/cell_lab/i;->c(Landroid/view/View;I)V

    .line 1329
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/saterskog/cell_lab/i;->o:Landroid/view/View;

    const v3, 0x7f0800e3

    move-object/from16 v0, p0

    invoke-direct {v0, v2, v3}, Lcom/saterskog/cell_lab/i;->c(Landroid/view/View;I)V

    .line 1330
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/saterskog/cell_lab/i;->o:Landroid/view/View;

    const v3, 0x7f0800ad

    move-object/from16 v0, p0

    invoke-direct {v0, v2, v3}, Lcom/saterskog/cell_lab/i;->c(Landroid/view/View;I)V

    .line 1331
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/saterskog/cell_lab/i;->o:Landroid/view/View;

    const v3, 0x7f08009f

    move-object/from16 v0, p0

    invoke-direct {v0, v2, v3}, Lcom/saterskog/cell_lab/i;->c(Landroid/view/View;I)V

    .line 1332
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/saterskog/cell_lab/i;->o:Landroid/view/View;

    const v3, 0x7f0800a1

    move-object/from16 v0, p0

    invoke-direct {v0, v2, v3}, Lcom/saterskog/cell_lab/i;->c(Landroid/view/View;I)V

    .line 1333
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/saterskog/cell_lab/i;->o:Landroid/view/View;

    const v3, 0x7f0800ab

    move-object/from16 v0, p0

    invoke-direct {v0, v2, v3}, Lcom/saterskog/cell_lab/i;->c(Landroid/view/View;I)V

    .line 1334
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/saterskog/cell_lab/i;->o:Landroid/view/View;

    const v3, 0x7f0800a3

    move-object/from16 v0, p0

    invoke-direct {v0, v2, v3}, Lcom/saterskog/cell_lab/i;->c(Landroid/view/View;I)V

    .line 1335
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/saterskog/cell_lab/i;->o:Landroid/view/View;

    const v3, 0x7f08009d

    move-object/from16 v0, p0

    invoke-direct {v0, v2, v3}, Lcom/saterskog/cell_lab/i;->c(Landroid/view/View;I)V

    .line 1336
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/saterskog/cell_lab/i;->o:Landroid/view/View;

    const v3, 0x7f0800c1

    move-object/from16 v0, p0

    invoke-direct {v0, v2, v3}, Lcom/saterskog/cell_lab/i;->c(Landroid/view/View;I)V

    .line 1337
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/saterskog/cell_lab/i;->o:Landroid/view/View;

    const v3, 0x7f0800c3

    move-object/from16 v0, p0

    invoke-direct {v0, v2, v3}, Lcom/saterskog/cell_lab/i;->c(Landroid/view/View;I)V

    .line 1339
    invoke-virtual/range {p0 .. p0}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v2

    const/4 v3, 0x1

    invoke-static {v2, v3}, Lcom/saterskog/cell_lab/j;->a(Landroid/content/Context;I)Z

    move-result v2

    if-nez v2, :cond_13

    .line 1341
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/saterskog/cell_lab/i;->o:Landroid/view/View;

    const v3, 0x7f0800ae

    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    const/16 v3, 0x8

    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    .line 1342
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/saterskog/cell_lab/i;->o:Landroid/view/View;

    const v3, 0x7f0800af

    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    const/16 v3, 0x8

    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    .line 1344
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/saterskog/cell_lab/i;->o:Landroid/view/View;

    const v3, 0x7f0800a7

    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    const/16 v3, 0x8

    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    .line 1345
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/saterskog/cell_lab/i;->o:Landroid/view/View;

    const v3, 0x7f0800a8

    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    const/16 v3, 0x8

    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    .line 1347
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/saterskog/cell_lab/i;->o:Landroid/view/View;

    const v3, 0x7f0800a9

    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    const/16 v3, 0x8

    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    .line 1348
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/saterskog/cell_lab/i;->o:Landroid/view/View;

    const v3, 0x7f0800e2

    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    const/16 v3, 0x8

    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    .line 1350
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/saterskog/cell_lab/i;->o:Landroid/view/View;

    const v3, 0x7f08002b

    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    const/16 v3, 0x8

    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    .line 1351
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/saterskog/cell_lab/i;->o:Landroid/view/View;

    const v3, 0x7f0800e4

    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    const/16 v3, 0x8

    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    .line 1353
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/saterskog/cell_lab/i;->o:Landroid/view/View;

    const v3, 0x7f080028

    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    const/16 v3, 0x8

    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    .line 1354
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/saterskog/cell_lab/i;->o:Landroid/view/View;

    const v3, 0x7f0800da

    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    const/16 v3, 0x8

    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    .line 1356
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/saterskog/cell_lab/i;->o:Landroid/view/View;

    const v3, 0x7f080029

    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    const/16 v3, 0x8

    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    .line 1357
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/saterskog/cell_lab/i;->o:Landroid/view/View;

    const v3, 0x7f0800db

    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    const/16 v3, 0x8

    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    .line 1362
    :cond_13
    const/4 v2, 0x1

    const/4 v3, 0x1

    move-object/from16 v0, p0

    invoke-virtual {v0, v2, v3}, Lcom/saterskog/cell_lab/i;->a(ZZ)V

    .line 1364
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/saterskog/cell_lab/i;->o:Landroid/view/View;

    return-object v2
.end method

.method public final onItemSelected(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView",
            "<*>;",
            "Landroid/view/View;",
            "IJ)V"
        }
    .end annotation

    .prologue
    const/4 v3, 0x6

    const/4 v6, 0x2

    const/4 v5, 0x1

    const/4 v4, 0x0

    const/4 v2, 0x4

    .line 1427
    iget-boolean v0, p0, Lcom/saterskog/cell_lab/i;->j:Z

    if-eqz v0, :cond_0

    .line 1475
    :goto_0
    return-void

    .line 1428
    :cond_0
    invoke-virtual {p1}, Landroid/widget/AdapterView;->getId()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    .line 1474
    :cond_1
    :goto_1
    :pswitch_0
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/i;->a()V

    goto :goto_0

    .line 1430
    :pswitch_1
    iget-object v0, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    iget v1, p0, Lcom/saterskog/cell_lab/i;->c:I

    aget-object v1, v0, v1

    iget-object v0, p0, Lcom/saterskog/cell_lab/i;->e:Ljava/util/ArrayList;

    invoke-virtual {v0, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/saterskog/cell_lab/h;

    iput-object v0, v1, Lcom/saterskog/cell_lab/Gene;->s:Lcom/saterskog/cell_lab/h;

    .line 1431
    iget-wide v0, p0, Lcom/saterskog/cell_lab/i;->n:D

    const-wide v2, 0x3fe999999999999aL    # 0.8

    sub-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(D)D

    move-result-wide v0

    const-wide v2, 0x3faeb851eb851eb8L    # 0.06

    cmpg-double v0, v0, v2

    if-gez v0, :cond_2

    iget-object v0, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    aget-object v0, v0, v4

    iget-boolean v0, v0, Lcom/saterskog/cell_lab/Gene;->l:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    aget-object v0, v0, v4

    iget-object v0, v0, Lcom/saterskog/cell_lab/Gene;->s:Lcom/saterskog/cell_lab/h;

    sget-object v1, Lcom/saterskog/cell_lab/h;->a:Lcom/saterskog/cell_lab/h;

    if-ne v0, v1, :cond_2

    .line 1432
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-static {v0, v6, v4}, Lcom/saterskog/cell_lab/t;->b(Landroid/app/Activity;II)V

    .line 1433
    :cond_2
    iget-object v0, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    aget-object v0, v0, v5

    iget-object v0, v0, Lcom/saterskog/cell_lab/Gene;->s:Lcom/saterskog/cell_lab/h;

    sget-object v1, Lcom/saterskog/cell_lab/h;->b:Lcom/saterskog/cell_lab/h;

    if-ne v0, v1, :cond_3

    iget-object v0, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    aget-object v0, v0, v6

    iget-object v0, v0, Lcom/saterskog/cell_lab/Gene;->s:Lcom/saterskog/cell_lab/h;

    sget-object v1, Lcom/saterskog/cell_lab/h;->a:Lcom/saterskog/cell_lab/h;

    if-ne v0, v1, :cond_3

    .line 1434
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-static {v0, v6, v6}, Lcom/saterskog/cell_lab/t;->b(Landroid/app/Activity;II)V

    .line 1435
    :cond_3
    iget-object v0, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    aget-object v0, v0, v4

    iget-boolean v0, v0, Lcom/saterskog/cell_lab/Gene;->l:Z

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    aget-object v0, v0, v4

    iget-object v0, v0, Lcom/saterskog/cell_lab/Gene;->s:Lcom/saterskog/cell_lab/h;

    sget-object v1, Lcom/saterskog/cell_lab/h;->n:Lcom/saterskog/cell_lab/h;

    if-ne v0, v1, :cond_4

    iget-object v0, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    aget-object v0, v0, v5

    iget-object v0, v0, Lcom/saterskog/cell_lab/Gene;->s:Lcom/saterskog/cell_lab/h;

    sget-object v1, Lcom/saterskog/cell_lab/h;->b:Lcom/saterskog/cell_lab/h;

    if-ne v0, v1, :cond_4

    iget-object v0, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    aget-object v0, v0, v6

    iget-object v0, v0, Lcom/saterskog/cell_lab/Gene;->s:Lcom/saterskog/cell_lab/h;

    sget-object v1, Lcom/saterskog/cell_lab/h;->a:Lcom/saterskog/cell_lab/h;

    if-ne v0, v1, :cond_4

    .line 1436
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v0

    const/4 v1, 0x3

    invoke-static {v0, v1, v4}, Lcom/saterskog/cell_lab/t;->b(Landroid/app/Activity;II)V

    .line 1437
    :cond_4
    invoke-virtual {p0, v4, v4}, Lcom/saterskog/cell_lab/i;->a(ZZ)V

    goto/16 :goto_1

    .line 1440
    :pswitch_2
    iput p3, p0, Lcom/saterskog/cell_lab/i;->c:I

    .line 1441
    invoke-virtual {p0, v5, v4}, Lcom/saterskog/cell_lab/i;->a(ZZ)V

    .line 1442
    iget v0, p0, Lcom/saterskog/cell_lab/i;->c:I

    if-ne v0, v2, :cond_1

    .line 1443
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-static {v0, v5, v6}, Lcom/saterskog/cell_lab/t;->b(Landroid/app/Activity;II)V

    goto/16 :goto_1

    .line 1446
    :pswitch_3
    iget-object v0, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    iget v1, p0, Lcom/saterskog/cell_lab/i;->c:I

    aget-object v0, v0, v1

    iput p3, v0, Lcom/saterskog/cell_lab/Gene;->i:I

    .line 1447
    iget-object v0, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    aget-object v0, v0, v2

    iget v0, v0, Lcom/saterskog/cell_lab/Gene;->i:I

    const/4 v1, 0x5

    if-ne v0, v1, :cond_5

    iget-object v0, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    aget-object v0, v0, v2

    iget v0, v0, Lcom/saterskog/cell_lab/Gene;->j:I

    if-ne v0, v3, :cond_5

    .line 1448
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-static {v0, v5, v3}, Lcom/saterskog/cell_lab/t;->b(Landroid/app/Activity;II)V

    .line 1449
    :cond_5
    iget-object v0, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    const/4 v1, 0x5

    aget-object v0, v0, v1

    iget v0, v0, Lcom/saterskog/cell_lab/Gene;->i:I

    if-ne v0, v2, :cond_6

    iget-object v0, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    const/4 v1, 0x5

    aget-object v0, v0, v1

    iget v0, v0, Lcom/saterskog/cell_lab/Gene;->j:I

    if-ne v0, v2, :cond_6

    iget-object v0, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    aget-object v0, v0, v3

    iget v0, v0, Lcom/saterskog/cell_lab/Gene;->i:I

    if-ne v0, v2, :cond_6

    iget-object v0, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    aget-object v0, v0, v3

    iget v0, v0, Lcom/saterskog/cell_lab/Gene;->j:I

    if-ne v0, v2, :cond_6

    .line 1450
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v0

    const/16 v1, 0x8

    invoke-static {v0, v5, v1}, Lcom/saterskog/cell_lab/t;->b(Landroid/app/Activity;II)V

    .line 1451
    :cond_6
    const v0, 0x1

    const v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/saterskog/cell_lab/i;->a(ZZ)V

    iget-object v0, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    aget-object v0, v0, v4

    iget v0, v0, Lcom/saterskog/cell_lab/Gene;->i:I

    if-ne v0, v5, :cond_1

    iget-object v0, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    aget-object v0, v0, v4

    iget v0, v0, Lcom/saterskog/cell_lab/Gene;->j:I

    if-ne v0, v6, :cond_1

    .line 1452
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-static {v0, v6, v5}, Lcom/saterskog/cell_lab/t;->b(Landroid/app/Activity;II)V

    goto/16 :goto_1

    .line 1456
    :pswitch_4
    iget-object v0, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    iget v1, p0, Lcom/saterskog/cell_lab/i;->c:I

    aget-object v0, v0, v1

    iput p3, v0, Lcom/saterskog/cell_lab/Gene;->j:I

    .line 1457
    iget-object v0, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    aget-object v0, v0, v2

    iget v0, v0, Lcom/saterskog/cell_lab/Gene;->i:I

    const/4 v1, 0x5

    if-ne v0, v1, :cond_7

    iget-object v0, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    aget-object v0, v0, v2

    iget v0, v0, Lcom/saterskog/cell_lab/Gene;->j:I

    if-ne v0, v3, :cond_7

    .line 1458
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-static {v0, v5, v3}, Lcom/saterskog/cell_lab/t;->b(Landroid/app/Activity;II)V

    .line 1459
    :cond_7
    iget-object v0, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    const/4 v1, 0x5

    aget-object v0, v0, v1

    iget v0, v0, Lcom/saterskog/cell_lab/Gene;->i:I

    if-ne v0, v2, :cond_8

    iget-object v0, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    const/4 v1, 0x5

    aget-object v0, v0, v1

    iget v0, v0, Lcom/saterskog/cell_lab/Gene;->j:I

    if-ne v0, v2, :cond_8

    iget-object v0, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    aget-object v0, v0, v3

    iget v0, v0, Lcom/saterskog/cell_lab/Gene;->i:I

    if-ne v0, v2, :cond_8

    iget-object v0, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    aget-object v0, v0, v3

    iget v0, v0, Lcom/saterskog/cell_lab/Gene;->j:I

    if-ne v0, v2, :cond_8

    .line 1460
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v0

    const/16 v1, 0x8

    invoke-static {v0, v5, v1}, Lcom/saterskog/cell_lab/t;->b(Landroid/app/Activity;II)V

    .line 1461
    :cond_8
    iget-object v0, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    aget-object v0, v0, v6

    iget v0, v0, Lcom/saterskog/cell_lab/Gene;->j:I

    if-nez v0, :cond_9

    .line 1462
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-static {v0, v6, v2}, Lcom/saterskog/cell_lab/t;->b(Landroid/app/Activity;II)V

    .line 1463
    :cond_9
    const v0, 0x1

    const v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/saterskog/cell_lab/i;->a(ZZ)V

    iget-object v0, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    aget-object v0, v0, v4

    iget v0, v0, Lcom/saterskog/cell_lab/Gene;->i:I

    if-ne v0, v5, :cond_1

    iget-object v0, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    aget-object v0, v0, v4

    iget v0, v0, Lcom/saterskog/cell_lab/Gene;->j:I

    if-ne v0, v6, :cond_1

    .line 1464
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-static {v0, v6, v5}, Lcom/saterskog/cell_lab/t;->b(Landroid/app/Activity;II)V

    goto/16 :goto_1

    .line 1428
    :pswitch_data_0
    .packed-switch 0x7f0800bf
        :pswitch_2
        :pswitch_3
        :pswitch_0
        :pswitch_4
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public final onNothingSelected(Landroid/widget/AdapterView;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView",
            "<*>;)V"
        }
    .end annotation

    .prologue
    .line 1480
    return-void
.end method

.method public final onProgressChanged(Landroid/widget/SeekBar;IZ)V
    .locals 12

    .prologue
    .line 1484
    iget-boolean v0, p0, Lcom/saterskog/cell_lab/i;->i:Z

    if-eqz v0, :cond_1

    .line 1580
    :cond_0
    :goto_0
    return-void

    .line 1485
    :cond_1
    iget-boolean v0, p0, Lcom/saterskog/cell_lab/i;->j:Z

    if-nez v0, :cond_0

    .line 1488
    invoke-virtual {p1}, Landroid/widget/SeekBar;->getId()I

    move-result v2

    .line 1489
    iget-boolean v0, p0, Lcom/saterskog/cell_lab/i;->h:Z

    if-eqz v0, :cond_4

    const v0, 0x7f0800b0

    if-eq v2, v0, :cond_4

    .line 1490
    const/16 v0, 0x18

    move v1, v0

    .line 1493
    :goto_1
    int-to-double v4, p2

    int-to-double v6, v1

    div-double/2addr v4, v6

    .line 1494
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v0

    const v3, 0x7f0800e8

    invoke-virtual {v0, v3}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 1496
    packed-switch v2, :pswitch_data_0

    .line 1576
    :cond_2
    :goto_2
    :pswitch_0
    iget-boolean v0, p0, Lcom/saterskog/cell_lab/i;->h:Z

    if-eqz v0, :cond_3

    iget v0, p0, Lcom/saterskog/cell_lab/i;->c:I

    invoke-direct {p0, v0}, Lcom/saterskog/cell_lab/i;->d(I)V

    .line 1578
    :cond_3
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/i;->a()V

    goto :goto_0

    .line 1492
    :cond_4
    const/16 v0, 0x4b0

    move v1, v0

    goto :goto_1

    .line 1498
    :pswitch_1
    int-to-double v2, p2

    const-wide v4, 0x4092c00000000000L    # 1200.0

    div-double/2addr v2, v4

    .line 1499
    const-wide/high16 v4, 0x4010000000000000L    # 4.0

    mul-double/2addr v4, v2

    const-wide/high16 v6, 0x4018000000000000L    # 6.0

    mul-double/2addr v4, v6

    const-wide/high16 v6, 0x4018000000000000L    # 6.0

    const-wide/high16 v8, 0x4010000000000000L    # 4.0

    const-wide/high16 v10, 0x3fe0000000000000L    # 0.5

    sub-double/2addr v2, v10

    mul-double/2addr v2, v8

    const-wide/high16 v8, 0x4045000000000000L    # 42.0

    mul-double/2addr v2, v8

    add-double/2addr v2, v6

    invoke-static {v4, v5, v2, v3}, Ljava/lang/Math;->max(DD)D

    move-result-wide v2

    iput-wide v2, p0, Lcom/saterskog/cell_lab/i;->n:D

    .line 1506
    if-eqz v0, :cond_2

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v2

    const v3, 0x7f0e007f

    invoke-virtual {v2, v3}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "%1$,.1f"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    iget-wide v6, p0, Lcom/saterskog/cell_lab/i;->n:D

    invoke-static {v6, v7}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v5

    aput-object v5, v3, v4

    invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v2

    const v3, 0x7f0e0080

    invoke-virtual {v2, v3}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_2

    .line 1509
    :pswitch_2
    iget-object v2, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    iget v3, p0, Lcom/saterskog/cell_lab/i;->c:I

    aget-object v2, v2, v3

    iget-object v2, v2, Lcom/saterskog/cell_lab/Gene;->a:[F

    const/4 v3, 0x0

    int-to-float v4, p2

    int-to-float v1, v1

    div-float v1, v4, v1

    aput v1, v2, v3

    .line 1510
    iget-object v1, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    iget v2, p0, Lcom/saterskog/cell_lab/i;->c:I

    aget-object v1, v1, v2

    iget-object v1, v1, Lcom/saterskog/cell_lab/Gene;->a:[F

    const/4 v2, 0x0

    aget v1, v1, v2

    const v2, 0x3f666666    # 0.9f

    cmpl-float v1, v1, v2

    if-lez v1, :cond_5

    iget-object v1, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    iget v2, p0, Lcom/saterskog/cell_lab/i;->c:I

    aget-object v1, v1, v2

    iget-object v1, v1, Lcom/saterskog/cell_lab/Gene;->a:[F

    const/4 v2, 0x1

    aget v1, v1, v2

    const v2, 0x3dcccccd    # 0.1f

    cmpg-float v1, v1, v2

    if-gez v1, :cond_5

    iget-object v1, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    iget v2, p0, Lcom/saterskog/cell_lab/i;->c:I

    aget-object v1, v1, v2

    iget-object v1, v1, Lcom/saterskog/cell_lab/Gene;->a:[F

    const/4 v2, 0x2

    aget v1, v1, v2

    const v2, 0x3dcccccd    # 0.1f

    cmpg-float v1, v1, v2

    if-gez v1, :cond_5

    .line 1511
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v1

    const/4 v2, 0x1

    const/4 v3, 0x5

    invoke-static {v1, v2, v3}, Lcom/saterskog/cell_lab/t;->b(Landroid/app/Activity;II)V

    .line 1512
    :cond_5
    if-eqz v0, :cond_2

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v2

    const v3, 0x7f0e007b

    invoke-virtual {v2, v3}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "%1$,.2f"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    iget-object v5, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    iget v6, p0, Lcom/saterskog/cell_lab/i;->c:I

    aget-object v5, v5, v6

    iget-object v5, v5, Lcom/saterskog/cell_lab/Gene;->a:[F

    const/4 v6, 0x0

    aget v5, v5, v6

    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v5

    aput-object v5, v3, v4

    invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_2

    .line 1515
    :pswitch_3
    iget-object v2, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    iget v3, p0, Lcom/saterskog/cell_lab/i;->c:I

    aget-object v2, v2, v3

    iget-object v2, v2, Lcom/saterskog/cell_lab/Gene;->a:[F

    const/4 v3, 0x1

    int-to-float v4, p2

    int-to-float v1, v1

    div-float v1, v4, v1

    aput v1, v2, v3

    .line 1516
    iget-object v1, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    iget v2, p0, Lcom/saterskog/cell_lab/i;->c:I

    aget-object v1, v1, v2

    iget-object v1, v1, Lcom/saterskog/cell_lab/Gene;->a:[F

    const/4 v2, 0x0

    aget v1, v1, v2

    const v2, 0x3f666666    # 0.9f

    cmpl-float v1, v1, v2

    if-lez v1, :cond_6

    iget-object v1, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    iget v2, p0, Lcom/saterskog/cell_lab/i;->c:I

    aget-object v1, v1, v2

    iget-object v1, v1, Lcom/saterskog/cell_lab/Gene;->a:[F

    const/4 v2, 0x1

    aget v1, v1, v2

    const v2, 0x3dcccccd    # 0.1f

    cmpg-float v1, v1, v2

    if-gez v1, :cond_6

    iget-object v1, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    iget v2, p0, Lcom/saterskog/cell_lab/i;->c:I

    aget-object v1, v1, v2

    iget-object v1, v1, Lcom/saterskog/cell_lab/Gene;->a:[F

    const/4 v2, 0x2

    aget v1, v1, v2

    const v2, 0x3dcccccd    # 0.1f

    cmpg-float v1, v1, v2

    if-gez v1, :cond_6

    .line 1517
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v1

    const/4 v2, 0x1

    const/4 v3, 0x5

    invoke-static {v1, v2, v3}, Lcom/saterskog/cell_lab/t;->b(Landroid/app/Activity;II)V

    .line 1518
    :cond_6
    if-eqz v0, :cond_2

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v2

    const v3, 0x7f0e0077

    invoke-virtual {v2, v3}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "%1$,.2f"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    iget-object v5, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    iget v6, p0, Lcom/saterskog/cell_lab/i;->c:I

    aget-object v5, v5, v6

    iget-object v5, v5, Lcom/saterskog/cell_lab/Gene;->a:[F

    const/4 v6, 0x1

    aget v5, v5, v6

    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v5

    aput-object v5, v3, v4

    invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_2

    .line 1521
    :pswitch_4
    iget-object v2, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    iget v3, p0, Lcom/saterskog/cell_lab/i;->c:I

    aget-object v2, v2, v3

    iget-object v2, v2, Lcom/saterskog/cell_lab/Gene;->a:[F

    const/4 v3, 0x2

    int-to-float v4, p2

    int-to-float v1, v1

    div-float v1, v4, v1

    aput v1, v2, v3

    .line 1522
    iget-object v1, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    iget v2, p0, Lcom/saterskog/cell_lab/i;->c:I

    aget-object v1, v1, v2

    iget-object v1, v1, Lcom/saterskog/cell_lab/Gene;->a:[F

    const/4 v2, 0x0

    aget v1, v1, v2

    const v2, 0x3f666666    # 0.9f

    cmpl-float v1, v1, v2

    if-lez v1, :cond_7

    iget-object v1, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    iget v2, p0, Lcom/saterskog/cell_lab/i;->c:I

    aget-object v1, v1, v2

    iget-object v1, v1, Lcom/saterskog/cell_lab/Gene;->a:[F

    const/4 v2, 0x1

    aget v1, v1, v2

    const v2, 0x3dcccccd    # 0.1f

    cmpg-float v1, v1, v2

    if-gez v1, :cond_7

    iget-object v1, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    iget v2, p0, Lcom/saterskog/cell_lab/i;->c:I

    aget-object v1, v1, v2

    iget-object v1, v1, Lcom/saterskog/cell_lab/Gene;->a:[F

    const/4 v2, 0x2

    aget v1, v1, v2

    const v2, 0x3dcccccd    # 0.1f

    cmpg-float v1, v1, v2

    if-gez v1, :cond_7

    .line 1523
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v1

    const/4 v2, 0x1

    const/4 v3, 0x5

    invoke-static {v1, v2, v3}, Lcom/saterskog/cell_lab/t;->b(Landroid/app/Activity;II)V

    .line 1524
    :cond_7
    if-eqz v0, :cond_2

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v2

    const v3, 0x7f0e0072

    invoke-virtual {v2, v3}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "%1$,.2f"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    iget-object v5, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    iget v6, p0, Lcom/saterskog/cell_lab/i;->c:I

    aget-object v5, v5, v6

    iget-object v5, v5, Lcom/saterskog/cell_lab/Gene;->a:[F

    const/4 v6, 0x2

    aget v5, v5, v6

    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v5

    aput-object v5, v3, v4

    invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_2

    .line 1527
    :pswitch_5
    iget-object v2, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    iget v3, p0, Lcom/saterskog/cell_lab/i;->c:I

    aget-object v2, v2, v3

    mul-int/lit8 v3, p2, 0x2

    int-to-double v4, v3

    const-wide v6, 0x400921fb54442d18L    # Math.PI

    mul-double/2addr v4, v6

    int-to-double v6, v1

    div-double/2addr v4, v6

    double-to-float v1, v4

    iput v1, v2, Lcom/saterskog/cell_lab/Gene;->e:F

    .line 1528
    if-eqz v0, :cond_2

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v2

    const v3, 0x7f0e0073

    invoke-virtual {v2, v3}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "%1$,.0f"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    iget-object v5, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    iget v6, p0, Lcom/saterskog/cell_lab/i;->c:I

    aget-object v5, v5, v6

    iget v5, v5, Lcom/saterskog/cell_lab/Gene;->e:F

    const/high16 v6, 0x43340000    # 180.0f

    mul-float/2addr v5, v6

    float-to-double v6, v5

    const-wide v8, 0x400921fb54442d18L    # Math.PI

    div-double/2addr v6, v8

    invoke-static {v6, v7}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v5

    aput-object v5, v3, v4

    invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\u00b0"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_2

    .line 1531
    :pswitch_6
    iget-object v2, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    iget v3, p0, Lcom/saterskog/cell_lab/i;->c:I

    aget-object v2, v2, v3

    mul-int/lit8 v3, p2, 0x2

    int-to-double v4, v3

    const-wide v6, 0x400921fb54442d18L    # Math.PI

    mul-double/2addr v4, v6

    int-to-double v6, v1

    div-double/2addr v4, v6

    double-to-float v1, v4

    iput v1, v2, Lcom/saterskog/cell_lab/Gene;->f:F

    .line 1532
    if-eqz v0, :cond_2

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v2

    const v3, 0x7f0e0075

    invoke-virtual {v2, v3}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "%1$,.0f"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    iget-object v5, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    iget v6, p0, Lcom/saterskog/cell_lab/i;->c:I

    aget-object v5, v5, v6

    iget v5, v5, Lcom/saterskog/cell_lab/Gene;->f:F

    const/high16 v6, 0x43340000    # 180.0f

    mul-float/2addr v5, v6

    float-to-double v6, v5

    const-wide v8, 0x400921fb54442d18L    # Math.PI

    div-double/2addr v6, v8

    invoke-static {v6, v7}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v5

    aput-object v5, v3, v4

    invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\u00b0"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_2

    .line 1535
    :pswitch_7
    iget-object v2, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    iget v3, p0, Lcom/saterskog/cell_lab/i;->c:I

    aget-object v2, v2, v3

    const v3, 0x3d84b5dd    # 0.0648f

    const v4, 0x3e9ad42c    # 0.3024f

    int-to-float v5, p2

    mul-float/2addr v4, v5

    int-to-float v1, v1

    div-float v1, v4, v1

    add-float/2addr v1, v3

    iput v1, v2, Lcom/saterskog/cell_lab/Gene;->b:F

    .line 1537
    if-eqz v0, :cond_8

    .line 1538
    iget-object v1, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    iget v2, p0, Lcom/saterskog/cell_lab/i;->c:I

    aget-object v1, v1, v2

    iget v1, v1, Lcom/saterskog/cell_lab/Gene;->b:F

    float-to-double v2, v1

    const-wide v4, 0x3fd70a3d70a3d70aL    # 0.36

    cmpl-double v1, v2, v4

    if-lez v1, :cond_9

    .line 1539
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v1

    const v2, 0x7f0e0079

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1545
    :cond_8
    :goto_3
    iget-object v0, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    const/4 v1, 0x1

    aget-object v0, v0, v1

    iget v0, v0, Lcom/saterskog/cell_lab/Gene;->b:F

    float-to-double v0, v0

    const-wide v2, 0x3fd70a3d70a3d70aL    # 0.36

    cmpl-double v0, v0, v2

    if-lez v0, :cond_2

    .line 1546
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v0

    const/4 v1, 0x2

    const/4 v2, 0x3

    invoke-static {v0, v1, v2}, Lcom/saterskog/cell_lab/t;->b(Landroid/app/Activity;II)V

    goto/16 :goto_2

    .line 1540
    :cond_9
    iget-object v1, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    iget v2, p0, Lcom/saterskog/cell_lab/i;->c:I

    aget-object v1, v1, v2

    iget v1, v1, Lcom/saterskog/cell_lab/Gene;->b:F

    float-to-double v2, v1

    const-wide v4, 0x3fb26e978d4fdf3bL    # 0.072

    cmpg-double v1, v2, v4

    if-gez v1, :cond_a

    .line 1541
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v2

    const v3, 0x7f0e0078

    invoke-virtual {v2, v3}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "%1$,.2f"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    const-wide/high16 v6, 0x3fe0000000000000L    # 0.5

    invoke-static {v6, v7}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v5

    aput-object v5, v3, v4

    invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v2

    const v3, 0x7f0e00d1

    invoke-virtual {v2, v3}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_3

    .line 1543
    :cond_a
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v2

    const v3, 0x7f0e007d

    invoke-virtual {v2, v3}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "%1$,.2f"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    iget-object v5, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    iget v6, p0, Lcom/saterskog/cell_lab/i;->c:I

    aget-object v5, v5, v6

    iget v5, v5, Lcom/saterskog/cell_lab/Gene;->b:F

    const/high16 v6, 0x41200000    # 10.0f

    mul-float/2addr v5, v6

    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v5

    aput-object v5, v3, v4

    invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v2

    const v3, 0x7f0e00e4

    invoke-virtual {v2, v3}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_3

    .line 1549
    :pswitch_8
    iget-object v2, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    iget v3, p0, Lcom/saterskog/cell_lab/i;->c:I

    aget-object v2, v2, v3

    int-to-double v4, p2

    int-to-double v6, v1

    div-double/2addr v4, v6

    .line 5582
    const-wide v6, 0x4058fffff9c00002L    # 99.99999850988391

    invoke-static {v6, v7, v4, v5}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v4

    const-wide v6, 0x3fb99999a0000000L    # 0.10000000149011612

    mul-double/2addr v4, v6

    .line 1549
    double-to-float v1, v4

    iput v1, v2, Lcom/saterskog/cell_lab/Gene;->g:F

    .line 1550
    if-eqz v0, :cond_2

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v2

    const v3, 0x7f0e007a

    invoke-virtual {v2, v3}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "%1$,.2f"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    iget-object v5, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    iget v6, p0, Lcom/saterskog/cell_lab/i;->c:I

    aget-object v5, v5, v6

    iget v5, v5, Lcom/saterskog/cell_lab/Gene;->g:F

    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v5

    aput-object v5, v3, v4

    invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_2

    .line 1553
    :pswitch_9
    iget-object v2, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    iget v3, p0, Lcom/saterskog/cell_lab/i;->c:I

    aget-object v2, v2, v3

    const v3, 0x3dcccccd    # 0.1f

    sub-int v4, v1, p2

    int-to-float v4, v4

    const v5, 0x3f4ccccd    # 0.8f

    mul-float/2addr v4, v5

    int-to-float v1, v1

    div-float v1, v4, v1

    add-float/2addr v1, v3

    iput v1, v2, Lcom/saterskog/cell_lab/Gene;->c:F

    .line 1554
    if-eqz v0, :cond_2

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v2

    const v3, 0x7f0e0074

    invoke-virtual {v2, v3}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "%1$,.2f"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    const/high16 v5, 0x3f800000    # 1.0f

    iget-object v6, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    iget v7, p0, Lcom/saterskog/cell_lab/i;->c:I

    aget-object v6, v6, v7

    iget v6, v6, Lcom/saterskog/cell_lab/Gene;->c:F

    sub-float/2addr v5, v6

    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v5

    aput-object v5, v3, v4

    invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 1555
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v2

    const v3, 0x7f0e0076

    invoke-virtual {v2, v3}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "%1$,.2f"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    iget-object v5, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    iget v6, p0, Lcom/saterskog/cell_lab/i;->c:I

    aget-object v5, v5, v6

    iget v5, v5, Lcom/saterskog/cell_lab/Gene;->c:F

    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v5

    aput-object v5, v3, v4

    invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 1554
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_2

    .line 1558
    :pswitch_a
    iget-object v1, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    iget v2, p0, Lcom/saterskog/cell_lab/i;->c:I

    aget-object v1, v1, v2

    const-wide/high16 v2, 0x4000000000000000L    # 2.0

    mul-double/2addr v2, v4

    const-wide v4, 0x400921fb54442d18L    # Math.PI

    mul-double/2addr v2, v4

    double-to-float v2, v2

    iput v2, v1, Lcom/saterskog/cell_lab/Gene;->d:F

    .line 1559
    if-eqz v0, :cond_2

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v2

    const v3, 0x7f0e007c

    invoke-virtual {v2, v3}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "%1$,.0f"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    iget-object v5, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    iget v6, p0, Lcom/saterskog/cell_lab/i;->c:I

    aget-object v5, v5, v6

    iget v5, v5, Lcom/saterskog/cell_lab/Gene;->d:F

    const/high16 v6, 0x43340000    # 180.0f

    mul-float/2addr v5, v6

    float-to-double v6, v5

    const-wide v8, 0x400921fb54442d18L    # Math.PI

    div-double/2addr v6, v8

    invoke-static {v6, v7}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v5

    aput-object v5, v3, v4

    invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\u00b0"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_2

    .line 1562
    :pswitch_b
    iget-object v1, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    iget v2, p0, Lcom/saterskog/cell_lab/i;->c:I

    aget-object v1, v1, v2

    const-wide v2, 0x4041800000000000L    # 35.0

    mul-double/2addr v2, v4

    double-to-float v2, v2

    iput v2, v1, Lcom/saterskog/cell_lab/Gene;->h:F

    .line 1563
    if-eqz v0, :cond_2

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v2

    const v3, 0x7f0e007e

    invoke-virtual {v2, v3}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "%1$,.1f"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    iget-object v5, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    iget v6, p0, Lcom/saterskog/cell_lab/i;->c:I

    aget-object v5, v5, v6

    iget v5, v5, Lcom/saterskog/cell_lab/Gene;->h:F

    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v5

    aput-object v5, v3, v4

    invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_2

    .line 1496
    nop

    :pswitch_data_0
    .packed-switch 0x7f08009c
        :pswitch_4
        :pswitch_0
        :pswitch_5
        :pswitch_0
        :pswitch_6
        :pswitch_0
        :pswitch_3
        :pswitch_0
        :pswitch_7
        :pswitch_0
        :pswitch_0
        :pswitch_8
        :pswitch_0
        :pswitch_9
        :pswitch_2
        :pswitch_0
        :pswitch_a
        :pswitch_0
        :pswitch_b
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public final onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 4

    .prologue
    .line 1379
    invoke-super {p0, p1}, Landroid/app/Fragment;->onSaveInstanceState(Landroid/os/Bundle;)V

    .line 1380
    const-string v0, "snapAngles"

    iget-boolean v1, p0, Lcom/saterskog/cell_lab/i;->h:Z

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 1381
    const-string v0, "mGenes"

    iget-object v1, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelableArray(Ljava/lang/String;[Landroid/os/Parcelable;)V

    .line 1382
    const-string v0, "mTime"

    iget-wide v2, p0, Lcom/saterskog/cell_lab/i;->n:D

    invoke-virtual {p1, v0, v2, v3}, Landroid/os/Bundle;->putDouble(Ljava/lang/String;D)V

    .line 1383
    iget-object v0, p0, Lcom/saterskog/cell_lab/i;->e:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    new-array v2, v0, [I

    .line 1384
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v0, p0, Lcom/saterskog/cell_lab/i;->e:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_0

    .line 1385
    iget-object v0, p0, Lcom/saterskog/cell_lab/i;->e:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/saterskog/cell_lab/h;

    invoke-virtual {v0}, Lcom/saterskog/cell_lab/h;->ordinal()I

    move-result v0

    aput v0, v2, v1

    .line 1384
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 1386
    :cond_0
    const-string v0, "genePool"

    invoke-virtual {p1, v0, v2}, Landroid/os/Bundle;->putIntArray(Ljava/lang/String;[I)V

    .line 1387
    const-string v0, "gi"

    iget v1, p0, Lcom/saterskog/cell_lab/i;->c:I

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 1388
    return-void
.end method

.method public final onStartTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 0

    .prologue
    .line 1732
    return-void
.end method

.method public final onStopTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 8

    .prologue
    const/4 v7, 0x1

    const/4 v6, 0x0

    const-wide v4, 0x3faeb851eb851eb8L    # 0.06

    .line 1736
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    .line 1737
    new-instance v1, Lcom/saterskog/cell_lab/i$4;

    invoke-direct {v1, p0}, Lcom/saterskog/cell_lab/i$4;-><init>(Lcom/saterskog/cell_lab/i;)V

    const-wide/16 v2, 0x1f4

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 1749
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v0

    const v1, 0x7f0800b0

    invoke-virtual {v0, v1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    if-ne p1, v0, :cond_2

    .line 1750
    iget-wide v0, p0, Lcom/saterskog/cell_lab/i;->n:D

    const-wide/high16 v2, 0x4000000000000000L    # 2.0

    sub-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(D)D

    move-result-wide v0

    cmpg-double v0, v0, v4

    if-gez v0, :cond_0

    .line 1751
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-static {v0, v7, v7}, Lcom/saterskog/cell_lab/t;->b(Landroid/app/Activity;II)V

    .line 1752
    :cond_0
    iget-wide v0, p0, Lcom/saterskog/cell_lab/i;->n:D

    const-wide/high16 v2, 0x4010000000000000L    # 4.0

    sub-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(D)D

    move-result-wide v0

    cmpg-double v0, v0, v4

    if-gez v0, :cond_1

    .line 1753
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v0

    const/4 v1, 0x7

    invoke-static {v0, v7, v1}, Lcom/saterskog/cell_lab/t;->b(Landroid/app/Activity;II)V

    .line 1754
    :cond_1
    iget-wide v0, p0, Lcom/saterskog/cell_lab/i;->n:D

    const-wide v2, 0x3fe999999999999aL    # 0.8

    sub-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(D)D

    move-result-wide v0

    cmpg-double v0, v0, v4

    if-gez v0, :cond_2

    iget-object v0, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    aget-object v0, v0, v6

    iget-boolean v0, v0, Lcom/saterskog/cell_lab/Gene;->l:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    aget-object v0, v0, v6

    iget-object v0, v0, Lcom/saterskog/cell_lab/Gene;->s:Lcom/saterskog/cell_lab/h;

    sget-object v1, Lcom/saterskog/cell_lab/h;->a:Lcom/saterskog/cell_lab/h;

    if-ne v0, v1, :cond_2

    .line 1755
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v0

    const/4 v1, 0x2

    invoke-static {v0, v1, v6}, Lcom/saterskog/cell_lab/t;->b(Landroid/app/Activity;II)V

    .line 1757
    :cond_2
    return-void
.end method
