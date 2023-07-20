.class final Landroid/support/v4/app/c$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/support/v4/app/j$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroid/support/v4/app/c;->a(ILandroid/support/v4/app/c$b;ZLandroid/util/SparseArray;Landroid/util/SparseArray;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/support/v4/app/d;

.field final synthetic b:Landroid/support/v4/app/c;


# direct methods
.method constructor <init>(Landroid/support/v4/app/c;Landroid/support/v4/app/d;)V
    .locals 0

    .prologue
    .line 1186
    iput-object p1, p0, Landroid/support/v4/app/c$1;->b:Landroid/support/v4/app/c;

    iput-object p2, p0, Landroid/support/v4/app/c$1;->a:Landroid/support/v4/app/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Landroid/view/View;
    .locals 1

    .prologue
    .line 1189
    iget-object v0, p0, Landroid/support/v4/app/c$1;->a:Landroid/support/v4/app/d;

    .line 2063
    iget-object v0, v0, Landroid/support/v4/app/d;->J:Landroid/view/View;

    .line 1189
    return-object v0
.end method
