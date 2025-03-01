.class final Landroid/support/v7/widget/b$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemSelectedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v7/widget/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/support/v7/widget/b;


# direct methods
.method constructor <init>(Landroid/support/v7/widget/b;)V
    .locals 0

    .prologue
    .line 1078
    iput-object p1, p0, Landroid/support/v7/widget/b$2;->a:Landroid/support/v7/widget/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onItemSelected(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 2
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
    .line 1082
    const/4 v0, -0x1

    if-eq p3, v0, :cond_0

    .line 1083
    iget-object v0, p0, Landroid/support/v7/widget/b$2;->a:Landroid/support/v7/widget/b;

    invoke-static {v0}, Landroid/support/v7/widget/b;->a(Landroid/support/v7/widget/b;)Landroid/support/v7/widget/b$a;

    move-result-object v0

    .line 1085
    if-eqz v0, :cond_0

    .line 1086
    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroid/support/v7/widget/b$a;->a(Landroid/support/v7/widget/b$a;Z)Z

    .line 1089
    :cond_0
    return-void
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
    .line 1092
    return-void
.end method
